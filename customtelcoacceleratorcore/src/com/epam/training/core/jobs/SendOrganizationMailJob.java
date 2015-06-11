package com.epam.training.core.jobs;

import com.epam.training.core.model.OrganisationModel;
import com.epam.training.core.services.OrganisationService;
import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SendOrganizationMailJob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(SendOrganizationMailJob.class);

    private OrganisationService organisationService;
    private EmailService emailService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("Sending organisation mails");
        final List<OrganisationModel> organisations = organisationService.getOrganisations();
        if (organisations.isEmpty())
        {
            LOG.info("No organisations found, skipping send of mails");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        for (final OrganisationModel organisation : organisations)
        {
            final String mailAddress = organisation.getEmail();
            if (!mailAddress.isEmpty())
            {
                LOG.info("Send email to:" + mailAddress);
                final EmailAddressModel toAddress = emailService.getOrCreateEmailAddressForEmail(mailAddress, organisation.getName());
                final EmailAddressModel fromAddress = emailService.getOrCreateEmailAddressForEmail("Admin@mail.com", "admin@mail.com");
                final String subject = "Email with list of users";

                final StringBuffer usersBuffer = new StringBuffer();
                for(final CustomerModel customer: organisation.getCustomers()){
                    usersBuffer
                            .append("<p>")
                            .append(customer.getName())
                            .append(" - ")
                            .append(customer.getStatus())
                            .append("</p>");
                }

                final String body = String.format("<p>Dear organization manager</p>" +
                                "<p>Here is list of users in your organization:</p> <p>%s</p>",
                        usersBuffer.toString());

                final EmailMessageModel emailMessageModel = emailService.createEmailMessage(Collections.singletonList(toAddress), null, null,
                        fromAddress, "reply@hybris.com", subject, body, null);
                emailService.send(emailMessageModel);



            }
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

    }

    @Required
    public void setOrganisationService(final OrganisationService organisationService)
    {
        this.organisationService = organisationService;
    }

    @Required
    public void setEmailService(final EmailService emailService)
    {
        this.emailService = emailService;
    }
}

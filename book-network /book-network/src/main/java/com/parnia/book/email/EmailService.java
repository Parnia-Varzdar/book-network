package com.parnia.book.email;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    @Async
    public void sendEmail(String to, String username, EmailTemplateName emailTemplate,
                          String confirmationUrl, String activationCode, String subject) {

    }
}

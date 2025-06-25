package org.example.task_tracker_email_sender.service;

import lombok.RequiredArgsConstructor;
import org.example.task_tracker_email_sender.dto.EmailTaskDTO;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender mailSender;
    public void sendMail(EmailTaskDTO msg) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(msg.getTo());
        simpleMailMessage.setSubject(msg.getSubject());
        simpleMailMessage.setText(msg.getBody());
        mailSender.send(simpleMailMessage);
    }
}

package org.example.task_tracker_email_sender.service;

import static java.lang.invoke.MethodHandles.lookup;
import static org.example.task_tracker_email_sender.configuration.TaskTrackerEmailSenderConstants.EMAIL_SENDING_TASKS;

import lombok.RequiredArgsConstructor;
import org.example.task_tracker_email_sender.dto.EmailTaskDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaListenerService {

  private static final Logger LOGGER = LoggerFactory.getLogger(lookup().lookupClass());

  @KafkaListener(topics = EMAIL_SENDING_TASKS, groupId = "email_sender")
  public void onEmailTask(EmailTaskDTO msg) {
    LOGGER.info("EmailTask body {}", msg);
  }
}

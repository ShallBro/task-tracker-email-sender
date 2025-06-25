package org.example.task_tracker_email_sender.dto;

import lombok.Data;

@Data
public class EmailTaskDTO {
  private String to;
  private String subject;
  private String body;
}

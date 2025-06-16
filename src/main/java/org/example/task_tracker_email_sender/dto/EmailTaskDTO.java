package org.example.task_tracker_email_sender.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailTaskDTO {
  private String to;
  private String subject;
  private String body;
}

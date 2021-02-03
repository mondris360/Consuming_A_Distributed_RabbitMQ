package com.externalqueueconsumer.demo.Dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmailDto {

    private String toEmail;
    private String fromEmail;
    private String subject;
    private String body;
}

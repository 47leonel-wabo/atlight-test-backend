package com.aiwa.atlighttestbackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
@Table(name = "massage")
public class CustomerMessage {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank
    private String message;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String subject;

    @CreationTimestamp
    private LocalDate createdAt;

    public CustomerMessage(
            String message,
            String name,
            @Email String email,
            String subject) {
        this.message = message;
        this.name = name;
        this.email = email;
        this.subject = subject;
    }
}

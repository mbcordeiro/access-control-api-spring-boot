package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Calendar {
    @Id
    private Long id;

    private String description;

    private LocalDateTime specialDate;

    @ManyToOne
    private DateType dateType;
}

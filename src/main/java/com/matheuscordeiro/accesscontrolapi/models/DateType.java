package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DateType {
    @Id
    private Long id;

    private String description;
}

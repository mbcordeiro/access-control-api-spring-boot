package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Audited
public class JourneyWork {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
}

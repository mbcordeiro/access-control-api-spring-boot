package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Audited
public class User {
    @Id
    private Long id;

    @ManyToOne
    private UserCategory userCategory;

    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private JourneyWork journeyWork;

    private BigDecimal tolerance;

    private LocalDateTime startJourney;

    private LocalDateTime endJourney;
}

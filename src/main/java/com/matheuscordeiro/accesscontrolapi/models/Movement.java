package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;

import javax.persistence.EmbeddedId;
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
public class Movement {
    @Id
    @EmbeddedId
    private MovementId movementId;

    private LocalDateTime startDate;

    private LocalDateTime exitDate;

    private BigDecimal timeCourse;

    @ManyToOne
    private Occurrence occurrence;

    @ManyToOne
    private Calendar calendar;
}

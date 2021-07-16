package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CompensatoryHours {
    @EmbeddedId
    private CompensatoryHoursId compensatoryHoursId;

    private LocalDateTime dateWorked;

    private BigDecimal amountHours;

    private BigDecimal hoursBalance;
}

package com.matheuscordeiro.accesscontrolapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
@Data
public class CompensatoryHoursId implements Serializable {
    private Long idCompensatoryHours;

    private Long idMovement;

    private Long idUser;
}

package com.matheuscordeiro.accesscontrolapi.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public  class MovementId implements Serializable {
    private Long idMovement;
    private Long idUser;
}

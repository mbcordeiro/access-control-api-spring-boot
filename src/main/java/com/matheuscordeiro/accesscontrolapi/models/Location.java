package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Location {
    @Id
    private Long id;
    private String description;
    @ManyToOne
    private AccessLevel accessLevel;
}

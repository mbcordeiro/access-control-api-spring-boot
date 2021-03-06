package com.matheuscordeiro.accesscontrolapi.models;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Audited
public class Company {
    @Id
    private Long id;

    private String description;

    private String cnpj;

    private String address;

    private String district;

    private String city;

    private String state;

    private String telephone;
}

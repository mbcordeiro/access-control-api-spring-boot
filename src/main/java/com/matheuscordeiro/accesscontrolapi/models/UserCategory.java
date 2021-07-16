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
public class UserCategory {
    @Id
    private Long id;
    private String description;
}

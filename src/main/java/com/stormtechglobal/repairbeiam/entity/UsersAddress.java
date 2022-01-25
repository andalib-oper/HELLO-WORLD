package com.stormtechglobal.repairbeiam.entity;

import com.stormtechglobal.commons.dto.AuditModel;

import java.util.UUID;
import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "UsersAddress")
public class UsersAddress extends AuditModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "address_l1")
    private String addressL1;

    @Column(name = "address_l2")
    private String addressL2;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "pin_code")
    private String pinCode ;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "map_coordinates")
    private String mapCoordinates;

}

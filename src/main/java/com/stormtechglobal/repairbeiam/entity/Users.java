package com.stormtechglobal.repairbeiam.entity;

import com.stormtechglobal.commons.dto.AuditModel;
import com.stormtechglobal.repairbeiam.enums.UserStatus;
import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class Users extends AuditModel {
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private UUID id;

  @Column(name = "user_id")
  private Long userId;

  @OneToOne
  @JoinColumn(name = "role_id", referencedColumnName = "id")
  private Role role;

  @Column(name = "user_status")
  private UserStatus userStatus;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "password")
  private String password;

  @Column(name = "date_of_joining")
  private LocalDate dateOfJoining;

  @OneToOne
  @JoinColumn(name = "user_contact_info_id", referencedColumnName = "id")
  private UserContactInfo userContactInfo;
}

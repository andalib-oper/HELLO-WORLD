package com.stormtechglobal.repairbeiam.entity;

import com.stormtechglobal.commons.dto.AuditModel;
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
@Table(name = "user_contact_info")
public class UserContactInfo extends AuditModel {
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private UUID id;

  @Column(name = "mobile_number")
  private String mobileNumber;

  @Column(name = "personal_email")
  private String personalEmail;

  @Column(name = "work_email")
  private String workEmail;

  @Column(name = "contact_number")
  private String contactNumber;

  @Column(name = "mobile_number_is_verified")
  private Boolean mobileNumberIsVerified;

  @Column(name = "personal_email_is_verified")
  private Boolean personalEmailIsVerified;
}

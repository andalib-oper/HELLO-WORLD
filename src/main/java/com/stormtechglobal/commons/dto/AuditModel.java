package com.stormtechglobal.commons.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.security.Timestamp;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditModel {

  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "yyyy-MM-dd HH:mm:ss.SSS",
      timezone = "UTC")
  @CreatedDate
  private Timestamp createdAt;

  @CreatedBy private String createdBy;

  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "yyyy-MM-dd HH:mm:ss.SSS",
      timezone = "UTC")
  @LastModifiedDate
  private Timestamp updatedAt;

  @LastModifiedBy private String updatedBy;

  private Boolean isActive = Boolean.TRUE;
}

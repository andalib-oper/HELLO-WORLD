package com.stormtechglobal.repairbeiam.dto;

import java.util.UUID;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponseDto {
  private UUID id;
  private String name;
}

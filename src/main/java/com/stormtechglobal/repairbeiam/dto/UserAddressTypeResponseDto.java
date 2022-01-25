package com.stormtechglobal.repairbeiam.dto;

import java.util.UUID;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserAddressTypeResponseDto {
    private UUID id;
    private String name;
}

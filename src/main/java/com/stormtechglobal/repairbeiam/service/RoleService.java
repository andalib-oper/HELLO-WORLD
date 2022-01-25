package com.stormtechglobal.repairbeiam.service;

import com.stormtechglobal.repairbeiam.dto.RoleRequestDto;
import com.stormtechglobal.repairbeiam.dto.RoleResponseDto;
import java.util.List;

public interface RoleService {
  RoleResponseDto create(RoleRequestDto roleRequestDto) throws Exception;

  List<RoleResponseDto> getAll();
}

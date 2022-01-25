package com.stormtechglobal.repairbeiam.service.impl;

import com.stormtechglobal.repairbeiam.dto.RoleRequestDto;
import com.stormtechglobal.repairbeiam.dto.RoleResponseDto;
import com.stormtechglobal.repairbeiam.entity.Role;
import com.stormtechglobal.repairbeiam.repository.RoleRepository;
import com.stormtechglobal.repairbeiam.service.RoleService;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
  @Inject private RoleRepository repository;

  public ModelMapper modelMapper;

  @Override
  public RoleResponseDto create(RoleRequestDto roleRequestDto) throws Exception {
    Role role = repository.findByName(roleRequestDto.getName());
    if (role != null) {
      throw new Exception("ROLE ALREADY EXISTS : " + roleRequestDto.getName());
    }
    Role createdRole = new Role();
    createdRole.setName(roleRequestDto.getName());
    repository.save(createdRole);
    return RoleResponseDto.builder().id(createdRole.getId()).name(createdRole.getName()).build();
  }

  @Override
  public List<RoleResponseDto> getAll() {
    List<Role> roleList = repository.findAll();
    List<RoleResponseDto> responseDto =
        roleList.stream()
            .map(role -> RoleResponseDto.builder().id(role.getId()).name(role.getName()).build())
            .collect(Collectors.toList());
    return responseDto;
  }
}

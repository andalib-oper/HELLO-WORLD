package com.stormtechglobal.repairbeiam.service;

import com.stormtechglobal.repairbeiam.dto.UserAddressTypeRequestDto;
import com.stormtechglobal.repairbeiam.dto.UserAddressTypeResponseDto;

import java.util.List;
import java.util.UUID;


public interface UserAddressTypeService{

    UserAddressTypeResponseDto create(UserAddressTypeRequestDto userAddressTypeRequestDto) throws Exception;
    List<UserAddressTypeResponseDto> getAll();

    UserAddressTypeResponseDto deleteById (UUID id);
}



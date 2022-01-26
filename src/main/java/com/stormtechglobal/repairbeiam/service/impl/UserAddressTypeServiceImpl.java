package com.stormtechglobal.repairbeiam.service.impl;

import com.stormtechglobal.repairbeiam.dto.UserAddressTypeRequestDto;
import com.stormtechglobal.repairbeiam.dto.UserAddressTypeResponseDto;
import com.stormtechglobal.repairbeiam.entity.UserAddressType;
import com.stormtechglobal.repairbeiam.repository.UserAddressTypeRepository;
import com.stormtechglobal.repairbeiam.service.UserAddressTypeService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserAddressTypeServiceImpl implements UserAddressTypeService {
    @Inject
    private UserAddressTypeRepository repository;

    public ModelMapper modelMapper;


    @Override
    public UserAddressTypeResponseDto create(UserAddressTypeRequestDto userAddressTypeRequestDto) throws Exception {
        UserAddressType userAddressType = repository.findByName(userAddressTypeRequestDto.getName());
        if (userAddressType != null) {
            throw new Exception("USER ADDRESS TYPE ALREADY EXISTS : " + userAddressTypeRequestDto.getName());
        }
        UserAddressType createdUserAddressType = new UserAddressType();
        createdUserAddressType.setName(userAddressTypeRequestDto.getName());
        repository.save(createdUserAddressType);
        return UserAddressTypeResponseDto.builder().id(createdUserAddressType.getId()).name(createdUserAddressType.getName()).build();
    }

    @Override
    public List<UserAddressTypeResponseDto> getAll() {
        List<UserAddressType> userAddressTypeList = repository.findAll();
        List<UserAddressTypeResponseDto> responseDto =
                userAddressTypeList.stream()
                        .map(userAddressType -> UserAddressTypeResponseDto.builder().id(userAddressType.getId()).name(userAddressType.getName()).build())
                        .collect(Collectors.toList());
        return responseDto;

    }

    @Override
    public UserAddressTypeResponseDto deleteById(UUID id) {
        Optional<UserAddressType> userAddressType=repository.findById(id);
        userAddressType.stream().map(
           userAddressType1 -> UserAddressType.builder().id(userAddressType1.getId()).name(userAddressType1.getName())
        ).collect(Collectors.toList());
        return null;
    }
}



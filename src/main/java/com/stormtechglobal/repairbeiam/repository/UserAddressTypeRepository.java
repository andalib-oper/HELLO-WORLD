package com.stormtechglobal.repairbeiam.repository;

import java.util.UUID;

import com.stormtechglobal.repairbeiam.dto.UserAddressTypeResponseDto;
import com.stormtechglobal.repairbeiam.entity.UserAddressType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressTypeRepository extends JpaRepository<UserAddressType, UUID>{
    UserAddressType findByName(String name);
}

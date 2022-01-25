package com.stormtechglobal.repairbeiam.repository;

import com.stormtechglobal.repairbeiam.entity.Role;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
  Role findByName(String name);
}

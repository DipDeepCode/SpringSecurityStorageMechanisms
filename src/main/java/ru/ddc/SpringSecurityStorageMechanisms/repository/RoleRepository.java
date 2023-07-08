package ru.ddc.SpringSecurityStorageMechanisms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ddc.SpringSecurityStorageMechanisms.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
}

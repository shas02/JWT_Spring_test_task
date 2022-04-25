package com.test_task.jwt_spring.repo;

import com.test_task.jwt_spring.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

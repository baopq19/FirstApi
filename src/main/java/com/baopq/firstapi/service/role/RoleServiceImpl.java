package com.baopq.firstapi.service.role;

import com.baopq.firstapi.domain.role.Role;
import com.baopq.firstapi.domain.role.RoleJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service @RequiredArgsConstructor @Transactional
@Slf4j
public class RoleServiceImpl implements RoleService{
    private final RoleJpaRepository roleJpaRepository;

    @Override
    public Role saveRole(Role role) {
        return roleJpaRepository.save(role);
    }
}

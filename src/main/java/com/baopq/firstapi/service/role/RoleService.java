package com.baopq.firstapi.service.role;

import com.baopq.firstapi.domain.role.Role;
import com.baopq.firstapi.domain.user.User;
import org.springframework.stereotype.Service;

public interface RoleService {
    Role saveRole(Role role);
}

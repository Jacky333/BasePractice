package com.pm.securitywithjpa.dao;

import com.pm.securitywithjpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/01/25 19:36
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findUserByUsername(String username);

}

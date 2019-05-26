package com.yyzy.zmy.mapper;

import com.yyzy.zmy.entry.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * customer的映射器
 */
@Repository
public interface UserMapper {
    List<User> getUsers();
}

package com.finalprojectbook.user.service;

import com.finalprojectbook.user.dto.UserDto;
import com.finalprojectbook.user.entity.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {
    void saveUser(@Valid UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
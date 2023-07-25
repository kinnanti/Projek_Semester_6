package comp.finalproject.book.service;

import comp.finalproject.book.dto.UserDto;
import comp.finalproject.book.entity.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {
    void saveUser(@Valid UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
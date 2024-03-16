package gov.toki.javatutorial.service;

import gov.toki.javatutorial.entity.User;

import java.util.List;

public interface UserService {

    long getUserCount();

    void createUser(User user);

    void updateUser(User user);

    void deleteById(Integer userId);

    List<User> getListUser();

    List<User> getUserUserName(String username);
}
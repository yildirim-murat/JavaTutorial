package gov.toki.javatutorial.service;

import gov.toki.javatutorial.entity.User;

public interface UserService {

    long getUserCount();

    void createUser(User user);
}
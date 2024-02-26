package gov.toki.javatutorial.service;

import gov.toki.javatutorial.entity.User;
import gov.toki.javatutorial.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public long getUserCount(){
        return userRepository.count();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
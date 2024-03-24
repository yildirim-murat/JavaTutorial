package gov.toki.javatutorial.service;

import gov.toki.javatutorial.entity.User;
import gov.toki.javatutorial.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void updateUser(User user){
        userRepository.save(user);
    }

    @Override
    public void deleteById(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<User> getListUser() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserUserName(String username) {
        return userRepository.getAllByName(username);
    }

    @Override
    public List<User> getCustomQuery(){
        return userRepository.getCustomQuery();
    }

}
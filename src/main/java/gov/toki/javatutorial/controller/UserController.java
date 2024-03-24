package gov.toki.javatutorial.controller;

import gov.toki.javatutorial.entity.User;
import gov.toki.javatutorial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@CrossOrigin(origins = "localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/count")
    public long getUserCount(){
        return userService.getUserCount();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable Integer userId, @RequestBody User user) {
        user.setId(userId);
        userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteById(userId);
    }

    @GetMapping("/get-list")
    public List<User> getList(){
        return userService.getListUser();
    }

    @GetMapping("/get-user/{userName}")
    public List<User> getUserName(@PathVariable String userName) {
        return userService.getUserUserName(userName);
    }

    @GetMapping("/custom")
    public List<User> getCustomList(){
        return userService.getCustomQuery();
    }
}
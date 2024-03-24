package gov.toki.javatutorial.repository;

import gov.toki.javatutorial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> getAllByName(String name);

    @Query("SELECT u FROM User u WHERE u.name= 'Muhammed Emin'")
    List<User> getCustomQuery();

}
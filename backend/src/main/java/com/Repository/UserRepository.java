package com.Repository;
import com.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Integer>{

    @Query(value = "from User where userAuth.username = :username and userAuth.password = :password")
    User checkUser(@Param("username") String username, @Param("password") String password);

    @Query(value = "from User where userId = :id")
    User getUserById(@Param("id") Integer id);


}

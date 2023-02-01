package com.vinicius.userdept.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vinicius.userdept.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}

package com.pineapple.soft.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pineapple.soft.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	

	

	User findByEmail(String user);

}

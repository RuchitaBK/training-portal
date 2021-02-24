package com.db.hack.trainingportal.repository;

import com.db.hack.trainingportal.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.db.hack.trainingportal.constant.UserQueries.USER_LOGIN;

public interface UserRepository extends JpaRepository<UserDetails,Long> {
  @Query(value = USER_LOGIN,nativeQuery = true)
    List<UserDetails> findByEmailPassword(
            @Param("email") String email,@Param("password") String password
  );
}

package com.db.hack.trainingportal.service;

import com.db.hack.trainingportal.model.LoginRequest;
import com.db.hack.trainingportal.model.UserDetails;
import com.db.hack.trainingportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public UserDetails savedata(UserDetails user) {
        String password=user.getPassword();


        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);

        user.setPassword(hashedPassword);
        boolean result = validatePassword(password,hashedPassword);
        System.out.print("Result:"+result);
     return userRepository.save(user);


    }

    public boolean validatePassword(String password,String hashedpassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(password, hashedpassword);
    }
    public String validateUser(LoginRequest loginRequest){

        String email=loginRequest.getEmail();
        String password=loginRequest.getPassword();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
       System.out.println("Calling repo to check record ");
        UserDetails userDetails= (UserDetails) userRepository.findByEmailPassword(email,hashedPassword);
        if(userDetails==null){
            System.out.println("Not Found");
            return "Not Found";
        }
        else {
            System.out.println(" Found");
            return "Found Record";
        }

    }
}

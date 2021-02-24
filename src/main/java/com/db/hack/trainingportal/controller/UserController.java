package com.db.hack.trainingportal.controller;


import com.db.hack.trainingportal.model.LoginRequest;
import com.db.hack.trainingportal.model.UserDetails;
import com.db.hack.trainingportal.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/Users")
public class UserController {


    @Autowired
    UserService userService;


    @PostMapping(path = "/register", consumes = "application/json")
    @ApiOperation("Register user ")
    public UserDetails addUser(@RequestBody UserDetails request) {
        return userService.savedata(request);

    }


  @GetMapping(path="/loginRequest",consumes = "application/json")
  @ApiOperation("validate user login and return user info")
    public String login(@RequestBody LoginRequest loginRequest){
      String result=userService.validateUser(loginRequest);
        return result ;

  }
    @GetMapping("/hello")
    public String getHello(){
        return "HELLLLLLLLLO";
    }
}

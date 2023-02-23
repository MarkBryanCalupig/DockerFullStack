package com.login.demo.Controller;

import com.login.demo.Entity.User;
import com.login.demo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;
    @PostMapping("/userDetails")
    public ResponseEntity<?> loginUser(@RequestBody User userData) {
      System.out.println(userData);
         Boolean flag = loginService.insertLoginDetails(userData);
        if(flag== true){
            return (ResponseEntity<User>)ResponseEntity.ok();
}else{
            return (ResponseEntity<User>) ResponseEntity.internalServerError();
}
}

    @GetMapping("/getAllDetails")
    public ResponseEntity<?> getAllUserDetails() throws Exception{
        return new ResponseEntity<>(loginService.getAllDetails(),HttpStatus.OK);
    }









}

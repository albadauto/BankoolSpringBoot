package br.com.bankool.bankool.controllers;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bankool.bankool.models.UserModel;
import br.com.bankool.bankool.repository.UserRepository;


@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/Message")
    public String Message(){
        String teste = "senha123";
        return BCrypt.hashpw(teste, BCrypt.gensalt());

    }

    @PostMapping("/CreateUser")
    public UserModel CreateUser(@RequestBody UserModel user){
        user.setUSUPASSWORD(BCrypt.hashpw(user.getUSUPASSWORD(), BCrypt.gensalt()));
        return userRepository.save(user);
    }

    @GetMapping("/GetUsers")
    public List<UserModel> ListUsers(){
        return userRepository.findAll();
    }

}

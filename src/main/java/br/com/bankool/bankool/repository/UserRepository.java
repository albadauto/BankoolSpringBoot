package br.com.bankool.bankool.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bankool.bankool.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer>{
    List<UserModel> findAll();
    UserModel findByEmail(String login);
}

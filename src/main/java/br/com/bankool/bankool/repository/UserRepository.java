package br.com.bankool.bankool.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.bankool.bankool.models.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer>{
    List<UserModel> findAll();
}

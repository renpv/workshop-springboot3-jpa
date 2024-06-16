package br.com.renpv.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renpv.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

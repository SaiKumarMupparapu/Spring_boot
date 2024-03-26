package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.User;

public interface UserRepo extends JpaRepository<User, Long> {
	public Optional<User> findByEmail(String email);

}

package coms.springsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import coms.springsecurity.model.security;


public interface securityrepos extends JpaRepository<security,Integer> {
	
}
package com.example.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.models.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
	
	Optional<Club> findByTitle(String str);

}

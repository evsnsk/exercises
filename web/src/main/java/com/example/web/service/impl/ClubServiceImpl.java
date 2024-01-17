package com.example.web.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.web.dto.ClubDto;
import com.example.web.models.Club;
import com.example.web.repository.ClubRepository;
import com.example.web.service.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

	private ClubRepository clubRepository;


	public ClubServiceImpl(ClubRepository clubRepository) {
		this.clubRepository = clubRepository;
	}

	@Override
	public List<ClubDto> findAllClubs() {
		List<Club> clubs = clubRepository.findAll();
		return clubs.stream().map(club -> mapToClubDto(club)).toList();
		
	}

	private ClubDto mapToClubDto(Club club) {
		ClubDto clubDto = ClubDto.builder()
				.id(club.getId())
				.title(club.getTitle())
				.photoUrl(club.getPhotoUrl())
				.content(club.getContent())
				.createdOn(club.getCreatedOn())
				.updatedOn(club.getUpdatedOn())
				.build();
		
		return clubDto;
	}

	@Override
	public Club saveClub(Club club) {
		return clubRepository.save(club);
	}

}

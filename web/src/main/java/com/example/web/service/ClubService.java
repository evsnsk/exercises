package com.example.web.service;

import java.util.List;
import com.example.web.dto.ClubDto;
import com.example.web.models.Club;

public interface ClubService {

	List<ClubDto> findAllClubs();

	Club saveClub(Club club);


}

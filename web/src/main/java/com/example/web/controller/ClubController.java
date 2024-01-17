package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.web.dto.ClubDto;
import com.example.web.models.Club;
import com.example.web.service.ClubService;

@Controller
public class ClubController {
	
	private ClubService clubService;
	
	@Autowired
	public ClubController(ClubService clubService) {
		this.clubService = clubService;
	}

	@GetMapping("/clubs")
	public String listClubs(Model model) {
		List<ClubDto> clubs = clubService.findAllClubs();
		model.addAttribute("clubs", clubs);
		return "clubs-list";
	}
	
	@GetMapping("/clubs/new")
	public String createClubForm(Model model) {
		Club club = new Club();
		model.addAttribute("club",club);
		return "club-create";
	}
	
	@PostMapping("/clubs/new")
	public String saveClub(@ModelAttribute("club") Club club) {
		clubService.saveClub(club);
		return "redirect:/clubs-list";
	}
	
	
}

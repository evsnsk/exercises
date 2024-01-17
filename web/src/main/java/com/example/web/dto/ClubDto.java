package com.example.web.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Setter
@Getter
public class ClubDto {

	private Long id;
	private String title;
	private String photoUrl;
	private String content;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

}

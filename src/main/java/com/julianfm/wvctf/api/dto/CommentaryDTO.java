package com.julianfm.wvctf.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentaryDTO {

	public UserDTO users;
	
	public ProductDTO product;
	
	public String text;
	
}
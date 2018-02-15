package com.rob0229.HotOrColdStatesGame.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Player {

	private @Id @GeneratedValue Long id;
	private String username;
	private String email;

	public Player() {

	}

	public Player(String username, String email) {
		this.username = username;
		this.email = email;
	}
}

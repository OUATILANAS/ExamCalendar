package com.example.demo.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
public class Surveillent extends Personne{
	


	private String matricule;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "role_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private Role role;
	  	public Surveillent(Long id, String nom, String prenom, String tel, String email, String cin, String password,String matricule) {
		super(id, nom, prenom, tel, email, cin, password);
		this.matricule=matricule;
	  		}

		public String getMatricule() {
			return matricule;
		}

		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}

		

	  	
}

package com.gilbertosantos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gilbertopsantosjr
 */
@Data
@Entity
@Table(name = "menu_day")
@NoArgsConstructor
@AllArgsConstructor
public class MenuDay {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@NotEmpty(message = " description of this menu can't be empty.")
	@Column(nullable = false, length = 255)
	private String description;
	
	
	public MenuDay(String description) {
		this.description = description;
	}
	
	

}

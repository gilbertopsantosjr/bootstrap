/**
 * 
 */
package com.gilbertosantos.model;

import java.time.DayOfWeek;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gilbertopsantosjr
 *
 */
@Data
@Entity
@Table(name = "food")
@NoArgsConstructor
@AllArgsConstructor
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Enumerated(EnumType.ORDINAL)
	@NotNull(message = "the day of the week, can't be empty.")
	@Column(name = "day", nullable = false)
	private DayOfWeek days;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<MenuDay> menu;
	
}

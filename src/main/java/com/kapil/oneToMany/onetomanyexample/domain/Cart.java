package com.kapil.oneToMany.onetomanyexample.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="cart")
public class Cart implements Serializable{

	private static final long serialVersionUID = 6544591481956513119L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cart_id")
	private Long id;
	
	@Column
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cart_id", referencedColumnName="cart_id")
	private List<Item> item;
}

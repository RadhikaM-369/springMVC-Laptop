package com.xworkz.laptop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "laptop_info")
public class LaptopEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "Brand")
	private String brand;
	@Column(name = "LaptopName")
	private String name;
	@Column(name = "Color")
	private String color;
	@Column(name = "RAM")
	private int ram;
	@Column(name = "ROM")
	private int rom;
	@Column(name = "Processor")
	private String processor;
	@Column(name = "Price")
	private double price;
	
	public LaptopEntity(String brand, String name, String color, int ram, int rom, String processor, double price) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.price = price;
	}

}

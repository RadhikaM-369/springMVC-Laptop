package com.xworkz.laptop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LaptopDto {
private String brand;
private String name;
private String color;
private int ram;
private int rom;
private String processor;
private double price;

}

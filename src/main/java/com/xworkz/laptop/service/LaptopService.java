package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;

public interface LaptopService {
	public boolean validateLaptopDTO(LaptopDto dto);
	public boolean saveLaptopDTO(LaptopDto dto);
}

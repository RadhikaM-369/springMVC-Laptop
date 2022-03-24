package com.xworkz.laptop.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.exception.InvalidBrand;
import com.xworkz.laptop.exception.InvalidColor;
import com.xworkz.laptop.exception.InvalidName;
import com.xworkz.laptop.exception.InvalidPrice;
import com.xworkz.laptop.exception.InvalidProcessor;
import com.xworkz.laptop.exception.InvalidRam;
import com.xworkz.laptop.exception.InvalidRom;
import com.xworkz.laptop.repository.LaptopRepo;


@Service
public class LaptopServiceImpl implements LaptopService{
	@Autowired	
	private LaptopRepo repo;
	@Override
	public boolean validateLaptopDTO(LaptopDto dto) throws InvalidBrand {
		System.out.println("Invoked validateLaptopDTO() ");
		boolean temp=false;
		if(dto.getBrand()!=null && !dto.getBrand().isEmpty()) {
		System.out.println("Laptop Brand is valid");	
		temp=true;
		}else {
			InvalidBrand invalidBrand=new InvalidBrand("Invalid Brand Name");
			throw invalidBrand;
		}
		if(dto.getName()!=null && !dto.getName().isEmpty()) {
			System.out.println("Laptop Name is valid");	
			temp=true;
			}else {
				InvalidName invalidName=new InvalidName("Invalid Name");
				throw invalidName;
			}
		if(dto.getColor()!=null && !dto.getColor().isEmpty()) {
			System.out.println("Laptop Color is valid");	
			temp=true;
			}else {
				InvalidColor invalidColor =new InvalidColor("Invalid Color"); 
				throw invalidColor; 
			}
		if(dto.getRam()!=0) {
			System.out.println("Laptop RAM is valid");	
			temp=true;
			}else {
				InvalidRam invalidRam= new InvalidRam("Invalid RAM size"); 
				throw invalidRam;
			}
		if(dto.getRom()!=0) {
			System.out.println("Laptop ROM is valid");	
			temp=true;
			}else {
				InvalidRom invalidRom= new InvalidRom("Invalid ROM size"); 
				throw invalidRom;
			}
		if(dto.getProcessor()!=null && !dto.getProcessor().isEmpty()) {
			System.out.println("Laptop Processor is valid");	
			temp=true;
			}else {
				InvalidProcessor invalidProcessor= new InvalidProcessor("Invalid Processor"); 
				throw invalidProcessor;
			}
		if(dto.getPrice()!=0) {
			System.out.println("Laptop Price is valid");	
			temp=true;
			}else {
				InvalidPrice invalidPrice= new InvalidPrice("Invalid Price"); 
				throw invalidPrice;
			}
		return false;
	}

	@Override
	public boolean saveLaptopDTO(LaptopDto dto) {
		System.out.println("Invoked saveLaptopDTO()");
		this.repo.saveLaptopEntity(dto);
		return false;
	}


}

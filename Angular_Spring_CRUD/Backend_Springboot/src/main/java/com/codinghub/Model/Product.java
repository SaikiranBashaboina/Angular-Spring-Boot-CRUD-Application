package com.codinghub.Model;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "Table_name")
public class Product {
	@Id
	//@Column(name = "Ïd")
	int id;
	String name;
	double price;
	int quantity;
	

	
}

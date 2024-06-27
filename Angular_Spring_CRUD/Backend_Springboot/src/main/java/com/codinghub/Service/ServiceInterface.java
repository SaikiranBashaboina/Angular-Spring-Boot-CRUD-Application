package com.codinghub.Service;

import java.util.List;

import com.codinghub.Model.Product;

public interface ServiceInterface {
	public Product save(Product product);
	public Product findd(int id);
	public List<Product> deletby(int id);
	public List<Product> printt();
	public Product updateProduct(int id, Product product);
	
}

//public Product gett(int id);
//public void delett(int id);
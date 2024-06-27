package com.codinghub.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Model.Product;
import com.codinghub.Repo.Dao;

@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired
	private Dao dao;

	@Override
	public Product save(Product product) {
		return dao.save(product);
		
	}

	public ServiceImpl(Dao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public List<Product> printt() {
		return (List<Product>) dao.findAll();
	}

	@Override
	public Product findd(int id) {
		Optional<Product> opt=dao.findById(id);
		Product pro=null;
		if(opt.isEmpty())
			return pro;
		else
			return pro=opt.get();
	}

	@Override
	public List<Product> deletby(int id) {
		Product p=findd(id);
		
			dao.deleteById(id);
			return (List<Product>) dao.findAll();
	}
	 @Override
	    public Product updateProduct(int id, Product product) {
	        Optional<Product> opt = dao.findById(id);
	        if (opt.isPresent()) {
	            Product existingProduct = opt.get();
	            existingProduct.setName(product.getName());
	            existingProduct.setPrice(product.getPrice());
	            existingProduct.setQuantity(product.getQuantity());
	            return dao.save(existingProduct);
	        } else {
	            return null; // or throw an exception
	        }
	    }

}

//@Override
//public Product gett(int id) {
//	Optional<Product> op=dao.findById(id);
//	Product p=op.get();
//	return p;
//}

//@Override
//public void delett(int id) {
//	dao.deleteById(id);
//}


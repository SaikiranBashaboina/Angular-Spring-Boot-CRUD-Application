package com.codinghub.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Model.Product;
import com.codinghub.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("http://localhost:4200")
public class OurController {
	@Autowired
	private ServiceImpl service;
	public OurController(ServiceImpl service) {
		super();
		this.service = service;
	}
	@PostMapping("/")
	public Product postMethodName(@RequestBody Product product) {
		return service.save(product);
	}
		
	@GetMapping("/{id}")
	public Product m1(@PathVariable int id)
	{
		return service.findd(id);
	}

	
	@DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable int id) {
        return service.deletby(id);
    }
	@GetMapping("/")
	public List<Product> prt(){
		return service.printt();
	}
	

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return service.updateProduct(id, product);
    }
}








//@DeleteMapping("/{id}")
//public String deleteProduct(@PathVariable int id) {
//  service.delett(id);
//  return "Deleted row";
//}



//@GetMapping("/{id}")
//public Product m1(@PathVariable int id)
//{
//	return service.gett(id);
//}




//@DeleteMapping("/{id}")
//public ResponseEntity<String> deleteProduct(@PathVariable int id) {
//    service.delete(id);
//    return ResponseEntity.ok("Deleted row with id: " + id);
//}
//


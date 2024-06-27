package com.codinghub.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.Model.Product;

@Repository
public interface Dao extends CrudRepository<Product , Integer>
{

}

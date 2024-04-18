package com.fellahClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.fellahClasses.DMS.Models.Dog;

/**
 * @author Kartikeya Datta
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{

}

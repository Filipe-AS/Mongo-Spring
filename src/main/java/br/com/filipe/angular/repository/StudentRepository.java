package br.com.filipe.angular.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.filipe.angular.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

	public Optional<Student> findByNameLikeIgnoreCase(String name);

}

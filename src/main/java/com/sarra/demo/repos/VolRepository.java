package com.sarra.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sarra.demo.entities.Vol;


@RepositoryRestResource(path = "v")
@CrossOrigin("http://localhost:4200/")
public interface VolRepository extends JpaRepository<Vol,Long> {

}

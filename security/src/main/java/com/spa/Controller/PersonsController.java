package com.spa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spa.Entity.Persons;
import com.spa.IService.IPersonsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/persons")
public class PersonsController {
	
	@Autowired
	private IPersonsService service;
	
	@GetMapping
	public List<Persons> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Persons> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Persons save(@RequestBody Persons persons) {
		return service.save(persons);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public Persons update(@PathVariable Long id, @RequestBody Persons persons) {
        Optional<Persons> op = service.findById(id);

        if (op.isPresent()) {
        	Persons personsUpdate = op.get();
            BeanUtils.copyProperties(persons, personsUpdate, "id");
            return service.save(personsUpdate);
        }

        return persons;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

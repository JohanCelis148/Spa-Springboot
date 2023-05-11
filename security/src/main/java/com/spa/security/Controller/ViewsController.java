package com.spa.security.Controller;

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
import com.spa.security.Entity.Views;
import com.spa.security.IService.IViewsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/views")
public class ViewsController {

	@Autowired
	private IViewsService service;
	
	@GetMapping
	public List<Views> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Views> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Views save(@RequestBody Views views) {
		return service.save(views);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public Views update(@PathVariable Integer id, @RequestBody Views views) {
        Optional<Views> op = service.findById(id);

        if (op.isPresent()) {
        	Views viewsUpdate = op.get();
            BeanUtils.copyProperties(views, viewsUpdate, "id");
            return service.save(viewsUpdate);
        }

        return views;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}



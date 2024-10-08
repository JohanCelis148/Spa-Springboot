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
import com.spa.security.Entity.ViewsRoles;
import com.spa.security.IService.IViewsRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/viewsRoles")
public class ViewsRolesController {
	
	@Autowired
	private IViewsRolesService service;
	
	@GetMapping
	public List<ViewsRoles> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<ViewsRoles> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ViewsRoles save(@RequestBody ViewsRoles viewsRoles) {
		return service.save(viewsRoles);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public ViewsRoles update(@PathVariable Integer id, @RequestBody ViewsRoles viewsRoles) {
        Optional<ViewsRoles> op = service.findById(id);

        if (op.isPresent()) {
        	ViewsRoles viewsRolesUpdate = op.get();
            BeanUtils.copyProperties(viewsRoles, viewsRolesUpdate, "id");
            return service.save(viewsRolesUpdate);
        }

        return viewsRoles;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}

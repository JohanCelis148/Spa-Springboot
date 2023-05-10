package com.sena.sql.Controller;

import java.util.List;
import java.util.Optional;

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

import com.sena.sql.Entity.ViewsRoles;
import com.sena.sql.lService.IViewsRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/views")
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
		
		if (!op.isEmpty()) {
			ViewsRoles viewsRolesUpdate = op.get();
			viewsRolesUpdate.setStatus(viewsRoles.getStatus());
			viewsRolesUpdate.setUserCreationId(viewsRoles.getUserCreationId());
			viewsRolesUpdate.setUserModificationId(viewsRoles.getUserModificationId());
			viewsRolesUpdate.setDateCreation(viewsRoles.getDateCreation());
			viewsRolesUpdate.setDateModification(viewsRoles.getDateModification());
			viewsRolesUpdate.setRolId(viewsRoles.getRolId());
			viewsRolesUpdate.setViewId(viewsRoles.getViewId());
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
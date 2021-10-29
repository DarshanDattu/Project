package com.example.demo.myauto.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.myauto.domain.OwnerDetails;
import com.example.demo.myauto.service.OwnerService;

@RestController
@RequestMapping(value = "/owner")
public class OwnerController {

	
	  @Autowired OwnerService ownerService;
	  
	  @PostMapping(value = "/saveOwner") public HashMap<String, Object>
	  saveOwner(@RequestBody OwnerDetails od) { HashMap<String, Object> map = new
	  HashMap<String, Object>(); OwnerDetails data = ownerService.saveOwner(od);
	  map.put("content", data); return map; }
	  
	  @PostMapping(value = "/owner/{id}") public HashMap<String, Object>
	  saveOwner(@PathVariable("id") Long id) { HashMap<String, Object> map = new
	  HashMap<String, Object>(); OwnerDetails data = ownerService.getOwner(id);
	  map.put("content", data); return map; }
	 
}

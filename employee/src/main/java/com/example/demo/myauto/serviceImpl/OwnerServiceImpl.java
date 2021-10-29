package com.example.demo.myauto.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.myauto.domain.OwnerDetails;
import com.example.demo.myauto.repository.OwnerRepo;
import com.example.demo.myauto.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {
	
	@Autowired
	OwnerRepo repo;

	@Transactional
	public OwnerDetails saveOwner(OwnerDetails od) {
		// TODO Auto-generated method stub
		return repo.save(od);
	}

	@Transactional
	public OwnerDetails getOwner(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}

package com.example.demo.myauto.service;

import java.util.Optional;

import com.example.demo.myauto.domain.OwnerDetails;

public interface OwnerService {

	OwnerDetails saveOwner(OwnerDetails od);

	OwnerDetails getOwner(Long id);

}

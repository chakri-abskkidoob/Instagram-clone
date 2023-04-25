package com.chakri.instagram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chakri.instagram.entity.InstagramUser;
import com.chakri.instagram.repository.InstagramUserRepository;

@Service
public class InstagramUserServiceImpl implements InstagramUserService {
	
	@Autowired
	private InstagramUserRepository iurepo;

	@Override
	public InstagramUser registerUser(InstagramUser iuser) {
		return iurepo.save(iuser);
	}

	@Override
	public InstagramUser findUserByCustomerId(Long customerId) {
		return iurepo.findById(customerId).get();
	}

	@Override
	public List<InstagramUser> findUserByNameOrUsername(String name, String userName) {
		return iurepo.findByNameOrUserName(name, userName);
	}

}

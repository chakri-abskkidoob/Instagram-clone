package com.chakri.instagram.service;

import java.util.List;

import com.chakri.instagram.entity.InstagramUser;

public interface InstagramUserService {

	InstagramUser registerUser(InstagramUser iuser);

	InstagramUser findUserByCustomerId(Long customerId);

	List<InstagramUser> findUserByNameOrUsername(String name, String userName);

}

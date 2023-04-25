package com.chakri.instagram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chakri.instagram.entity.InstagramUser;

@Repository
public interface InstagramUserRepository extends JpaRepository<InstagramUser, Long>{

	List<InstagramUser> findByNameOrUserName(String name, String userName);

}

package com.example.multidbinstance.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.multidbinstance.application.MigrationService;
import com.example.multidbinstance.entity.User;
import com.example.multidbinstance.mapper.db1.UserMapper1;
import com.example.multidbinstance.mapper.db2.UserMapper2;

@Service
public class MigrationService {

	@Autowired
	private UserMapper1 mapper1;

	@Autowired
	private UserMapper2 mapper2;

	@Transactional(transactionManager = "txManager2")
	public void migrate1to2() throws Exception {
		
		// db1から取得
		List<User> users = mapper1.findAll();
		
		// db2に保存
		users.stream().forEach(e -> {
			mapper2.save(e);
		});
		
		System.out.println("終了:"
				+ "migrate1to2");
	}
}
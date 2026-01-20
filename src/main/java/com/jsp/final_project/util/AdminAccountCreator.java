package com.jsp.final_project.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.jsp.final_project.dao.UserDao;
import com.jsp.final_project.dto.UserDto;
import com.jsp.final_project.entity.User;
import com.jsp.final_project.mapper.MyMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AdminAccountCreator implements CommandLineRunner {

	private final PasswordEncoder encoder;
	private final MyMapper mapper;
	private final UserDao userDao;

	@Value("${ADMIN.EMAIL}")
	private String email;
	@Value("${ADMIN.PASSWORD}")
	private String password;
	@Value("${ADMIN.MOBILE}")
	private Long mobile;
	@Value("${ADMIN.USERNAME}")
	private String name;

	@Override
	public void run(String... args) throws Exception {
		if (!userDao.checkIfExists(mobile, email)) {
			UserDto dto = new UserDto(name, email, encoder.encode(password), mobile);
			User admin = mapper.toUserEntity(dto);
			userDao.saveAdmin(admin);
		}
	}

}

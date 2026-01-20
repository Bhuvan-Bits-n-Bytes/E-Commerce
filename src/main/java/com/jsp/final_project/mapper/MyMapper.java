package com.jsp.final_project.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jsp.final_project.dto.UserDto;
import com.jsp.final_project.entity.User;

@Mapper(componentModel = "spring")
public interface MyMapper {
	
	@Mapping(target = "id",ignore = true)
	@Mapping(target = "role",ignore = true)
	@Mapping(target = "active",expression = "java(true)")
	User toUserEntity(UserDto dto);

}

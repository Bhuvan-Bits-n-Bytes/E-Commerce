package com.jsp.final_project.mapper;

import com.jsp.final_project.dto.UserDto;
import com.jsp.final_project.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-17T22:14:15+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.0.v20250526-2018, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class MyMapperImpl implements MyMapper {

    @Override
    public User toUserEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( dto.getEmail() );
        if ( dto.getMobile() != null ) {
            user.setMobile( dto.getMobile() );
        }
        user.setName( dto.getName() );
        user.setPassword( dto.getPassword() );

        user.setActive( true );

        return user;
    }
}

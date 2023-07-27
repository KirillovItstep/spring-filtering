package org.itstep.controller.mapper;

import org.itstep.controller.dto.UserResponse;
import org.itstep.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toResponse(User user);
}

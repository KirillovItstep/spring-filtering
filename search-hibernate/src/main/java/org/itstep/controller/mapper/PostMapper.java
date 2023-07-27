package org.itstep.controller.mapper;

import org.itstep.controller.dto.PostResponse;
import org.itstep.domain.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface PostMapper {
    PostResponse toResponse(Post post);
}
package org.itstep.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.itstep.domain.Tag;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostResponse {
    private String id;
    private String body;
    private UserResponse user;
    private Tag tag;
    private String imageUrl;
    private String imageDescription;
    private String hashTags;
    private long likeCount;
    private LocalDateTime createdAt;
}

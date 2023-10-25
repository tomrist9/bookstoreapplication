package com.example.bbokstorelast.model.mapper;

import com.example.bbokstorelast.model.dto.response.ReviewResponseDTO;
import com.example.bbokstorelast.model.entity.Review;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    ReviewResponseDTO reviewToReviewResponseDTO(Review review);
}

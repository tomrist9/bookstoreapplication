package com.example.bbokstorelast.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponseDTO {
    Long id;
    String reviewText;
    Integer likeCount;
    LocalDateTime reviewData;
}

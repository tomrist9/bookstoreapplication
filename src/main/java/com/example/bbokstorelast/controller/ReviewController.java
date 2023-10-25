package com.example.bbokstorelast.controller;

import com.example.bbokstorelast.model.dto.response.ReviewResponseDTO;
import com.example.bbokstorelast.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    public List <ReviewResponseDTO> getAllReviews(){
        return reviewService.getAllReviews;
    }

   @GetMapping
   public ReviewResponseDTO getReviewById(PathVariable Long id){
        return  reviewService.getReviewById(id);
   }
}


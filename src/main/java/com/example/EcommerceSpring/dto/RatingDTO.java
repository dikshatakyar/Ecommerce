package com.example.EcommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatingDTO {
    private double rate;
    private double count;
}

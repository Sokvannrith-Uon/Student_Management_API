package com.example.spring_exception.Model.Request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentRequest {
    private String name;
    private float score;
}

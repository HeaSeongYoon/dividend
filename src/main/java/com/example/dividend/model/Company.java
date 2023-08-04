package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Company {
    private String ticker;
    private String name;


    public Company() {
        // 기본 생성자의 내용을 추가합니다.
    }
}

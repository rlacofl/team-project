package com.myapp.team.product;

import com.myapp.team.image.Image;
import com.myapp.team.option.Option;
import lombok.Getter;
import lombok.Setter;

import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Product {

    private Integer productNo;
    private String productCondition;
    private String categoryName;
    private String productName;
    private String productContent;
    private double productPrice;
    private String productImageName;

    private String productImagePath; // 이미지 경로 추가

    private List<Option> options;  // 옵션 리스트

    public Product() {
        this.options = new ArrayList<>();  // options 필드를 빈 리스트로 초기화
    }

    private MultipartFile productImageFile;

}




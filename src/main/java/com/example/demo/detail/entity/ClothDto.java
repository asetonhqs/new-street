package com.example.demo.detail.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

public class ClothDto {
    ClothDto(){}

    @Getter(value = AccessLevel.PUBLIC)
    @Setter
    @NoArgsConstructor
    public static class Post{
        public String getClothName(){
            return clothName;
        }
        String clothName;
        String[] colors;
        String[] sizes;
        int clothSale;
        int clothPrice;
        String detailText;
        MultipartFile imageThumbnail;
        MultipartFile[] imgs;

        public void showFields(){
            System.out.println(clothName+" 옷이름");
            System.out.println(clothPrice+ "가격");
            System.out.println(clothSale + "할인금액");
        }

    }
}

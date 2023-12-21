package com.dday.card;

import lombok.Getter;

@Getter
public class CardResponseDto {

    private Long id;    // 카드의 ID 값
    private Integer day;   // 해당 날짜
    private String desc;   // 설명
    private String image;  // 이미지 URL

    public CardResponseDto (Card card) {
        this.id = card.getId();
        this.day = card.getDay();
        this.desc = card.getDescription();
        this.image = card.getImage();
    }

}

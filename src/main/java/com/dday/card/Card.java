package com.dday.card;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "cards")
@NoArgsConstructor  // 빈 생성자가 있어야 엔티티 값 수정 가능
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 값 자동 증가
    private Long id;

    @Column(name = "day", nullable = false)
    private Integer day;  // 해당 날짜 (id와 동일한 값)

    @Column(name = "description", nullable = false)
    private String description;  // 해당 날짜에 출력할 설명

    @Column(name = "image")
    private String image; // 이미지 주소 (AWS 활용)

    public Card (CardRequestDto cardRequestDto) {
        this.day = cardRequestDto.getDay();
        this.description = cardRequestDto.getDesc();
    }

}

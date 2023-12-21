package com.dday.card;

public interface CardService {

    /**
     * 카드의 정보를 리턴하는 메소드
     * @param id: 리턴할 카드의 ID 값
     * @return: 카드에 담긴 정보
     */
    CardResponseDto getCardInfo(Long id);

    /**
     * 카드의 정보를 등록하는 메소드
     * @param cardRequestDto: 등록한 카드의 정보
     */
    void createCardInfo(CardRequestDto cardRequestDto);
}

package com.dday.card;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public CardResponseDto getCardInfo(Long id) {
        Card card = cardRepository.findById(id).orElseThrow();
        return new CardResponseDto(card);
    }

    @Override
    public void createCardInfo(CardRequestDto cardRequestDto) {
        Card card = new Card(cardRequestDto);
        cardRepository.save(card);
    }
}

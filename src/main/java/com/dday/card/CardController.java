package com.dday.card;

import com.dday.common.ApiResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping("/card/{id}")
    public ResponseEntity<CardResponseDto> getCardInfo(@PathVariable Long id) {
        return ResponseEntity.ok(cardService.getCardInfo(id));
    }

    @ResponseBody
    @PostMapping("/card")
    public ResponseEntity<ApiResponseDto> createPost(@RequestBody CardRequestDto cardRequestDto) {
        try{
            cardService.createCardInfo(cardRequestDto);
            return ResponseEntity.ok().body(new ApiResponseDto(HttpStatus.OK.value(), "OK"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponseDto(HttpStatus.BAD_REQUEST.value(), "BAD_REQUEST"));
        }
    }

}

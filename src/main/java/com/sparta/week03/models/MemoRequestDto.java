package com.sparta.week03.models;

import com.sparta.week03.domain.Memo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MemoRequestDto {
    private String userId;
    private String contents;

    public MemoRequestDto(String userId, String contents){
        this.userId = userId;
        this.contents = contents;
    }
}

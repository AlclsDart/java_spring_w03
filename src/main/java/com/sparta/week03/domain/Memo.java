package com.sparta.week03.domain;

import com.sparta.week03.models.MemoRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Memo extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @Column
    private String userId;

    @Column
    private String contents;

    public Memo(MemoRequestDto requestDto){
        this.userId = requestDto.getUserId();
        this.contents = requestDto.getContents();
    }
}

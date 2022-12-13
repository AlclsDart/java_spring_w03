package com.sparta.week03.service;

import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.models.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;
    public Long update(MemoRequestDto requestDto){
        return memoRepository
    }
}

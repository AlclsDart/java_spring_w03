package com.sparta.week03.controller;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.models.MemoRequestDto;
import com.sparta.week03.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoRepository memoRepository;

    @GetMapping("/api/memos")
    public List<Memo> getMemos(){
        return memoRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime.now().minusDays(1), LocalDateTime.now());
    }

    @PostMapping("/api/memos")
    public Memo postMemos(@RequestBody MemoRequestDto requestDto){
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }


    private final MemoService memoService;
    @PutMapping("/api/memos/{id}")
    public Long update(@PathVariable Long id, @RequestBody MemoRequestDto requestDto){
        return memoService.update(id, requestDto);
    }

    @DeleteMapping("/api/memos/{id}")
    public Long delete(@PathVariable Long id){
        memoRepository.deleteById(id);
        return id;
    }
}

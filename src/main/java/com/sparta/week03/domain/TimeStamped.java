package com.sparta.week03.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class TimeStamped {
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}

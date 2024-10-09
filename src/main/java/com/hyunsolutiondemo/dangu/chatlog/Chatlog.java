package com.hyunsolutiondemo.dangu.chatlog;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Chatlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "workspace_id", nullable = false)
    private Long workspaceId;

    @Column(name = "enter_time", nullable = true)
    private LocalDateTime enterTime;

    @Column(name = "is_out", nullable = false)
    @ColumnDefault("false")
    private Boolean isOut;

    @Column(name = "read_count", nullable = false)
    @ColumnDefault("0")
    private Integer readCount;

    /*
    public void updateReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public void read() {
        this.readCount++;
    }

     */

    @Builder
    public Chatlog(Long userId, Long workspaceId, Boolean isOut, Integer readCount, LocalDateTime enterTime){
        this.userId = userId;
        this.workspaceId = workspaceId;
        this.isOut = isOut;
        this.readCount = readCount;
        this.enterTime=enterTime;

    }


}

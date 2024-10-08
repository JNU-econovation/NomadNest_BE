package com.workspace;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id", nullable = false)
    private int userId;


    @Column(name = "is_matched", nullable = false)
    @ColumnDefault("false")
    private boolean isMatched;


    @Column(name = "creator_match", nullable = false)
    @ColumnDefault("false")
    private boolean creatorMatch;

    @Column(name = "total_cnt", nullable = false)
    @ColumnDefault("0")
    private int tocalCnt;

    @Builder
    public Workspace(int userId, boolean isMatched, boolean creatorMatch, int totalCnt) {
        this.userId = userId;
        this.isMatched = isMatched;
        this.creatorMatch = creatorMatch;
        this.tocalCnt=totalCnt;
    }



}

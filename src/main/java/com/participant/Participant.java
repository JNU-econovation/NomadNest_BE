package com.participant;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "workspace_id", nullable = false)
    private Long workspaceId;

    @Column(name = "visitor_match", nullable = false)
    @ColumnDefault("false")
    private boolean visitorMatch;

    @Builder
    public Participant(Long userId, Long workspaceId, boolean visitorMatch) {
        this.userId = userId;
        this.workspaceId = workspaceId;
        this.visitorMatch = visitorMatch;
    }

}

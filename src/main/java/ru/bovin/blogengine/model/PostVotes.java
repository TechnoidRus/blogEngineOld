package ru.bovin.blogengine.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "post_votes")
public class PostVotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    @NotNull
    private LocalDateTime time;
    @NotNull
    private Integer value;
}

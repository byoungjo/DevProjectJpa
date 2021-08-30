package org.hdcd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name="board")
@ApiModel("보드테스트")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="board_no")
    private long boardNo;
    @Column(name="title")
    private String title;
    @Column(name="content")
    private String content;
    @Column(name="writer")
    private String writer;
    @JsonFormat(pattern ="yyyy-MM-dd")
    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;
}

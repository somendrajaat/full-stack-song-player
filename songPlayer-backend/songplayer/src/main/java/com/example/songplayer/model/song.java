package com.example.songplayer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class song {




    @Id
    private String Id;

    private String fileName;
    private String title;
    private String artist;

    private boolean isFavorited;
}

package com.example.songplayer.repository;

import com.example.songplayer.model.song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface songRepository extends MongoRepository<song,String> {}

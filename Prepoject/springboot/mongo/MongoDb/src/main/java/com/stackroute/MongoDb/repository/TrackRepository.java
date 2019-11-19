package com.stackroute.MongoDb.repository;

import com.stackroute.MongoDb.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface TrackRepository extends MongoRepository<Track, Integer> {
////    @Query("SELECT t FROM Track t where t.trackName = ?1")
//    List<Track> findByTrackName(String trackName);
}

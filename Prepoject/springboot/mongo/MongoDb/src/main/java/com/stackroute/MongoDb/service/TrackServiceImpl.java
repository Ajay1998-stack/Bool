package com.stackroute.MongoDb.service;


import com.stackroute.MongoDb.domain.Track;
import com.stackroute.MongoDb.exceptions.TrackAlreadyExistsException;
import com.stackroute.MongoDb.exceptions.TrackNotFoundException;
import com.stackroute.MongoDb.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@Primary
@Qualifier("trackServiceImpl")
public class TrackServiceImpl implements TrackService {
    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException {
        if(trackRepository.existsById(track.getId())){
            throw new TrackAlreadyExistsException("track already exists");
        }
        Track savedTrack = trackRepository.save(track);
//        if(savedTrack== null){
//            throw  new TrackAlreadyExistsException("track exists");
//        }
        return savedTrack;
    }

    @Override
    public List getAllTracks() {
        List trackList = trackRepository.findAll();
        return trackList;
    }

    @Override
    public Track updateTrack(int id,Track track) {
        Optional<Track> updatedTrack1 = trackRepository.findById(id);
        track.setId(id);

        return track;
    }

    @Override
    public List updatedTracks(Track track,int id) {
        trackRepository.deleteById(id);
        List updatedTracks= trackRepository.findAll();
        return updatedTracks;
    }

//    @Override
//    public List<Track> findByTrackName(String trackName) throws TrackNotFoundException {
//     List<Track> track  = trackRepository.findByTrackName(trackName);
//        if((track.isEmpty())){
//            throw new TrackNotFoundException("not found");
//        }
//            return track;
//    }
}

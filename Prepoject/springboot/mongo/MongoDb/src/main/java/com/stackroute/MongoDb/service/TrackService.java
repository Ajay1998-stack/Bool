package com.stackroute.MongoDb.service;

import com.stackroute.MongoDb.domain.Track;
import com.stackroute.MongoDb.exceptions.TrackAlreadyExistsException;
import com.stackroute.MongoDb.exceptions.TrackNotFoundException;


import java.util.List;

public interface TrackService {
    public Track saveTrack(Track track) throws TrackAlreadyExistsException;

    public List getAllTracks();

    public Track updateTrack(int id, Track track);

    public List updatedTracks(Track track, int id);

   // public List<Track> findByTrackName(String trackName) throws TrackNotFoundException;
}

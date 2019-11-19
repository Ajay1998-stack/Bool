package com.stackroute.MongoDb.seeds;


import com.stackroute.MongoDb.domain.Track;
import com.stackroute.MongoDb.exceptions.TrackAlreadyExistsException;
import com.stackroute.MongoDb.repository.TrackRepository;
import com.stackroute.MongoDb.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {


    TrackRepository trackService;

    @Autowired
    public CommandLineRunner(TrackRepository trackService) {
        this.trackService = trackService;
    }

    @Value("${track.trackName}")
    private String trackName;

    @Value("${track.comments}")
    private String comments;

    @Value("${track.id}")
    private int id;

    @Override
    public void run(String... args) throws Exception {
        Track track= new Track(id,trackName,comments);
        trackService.save(track);
    }
}

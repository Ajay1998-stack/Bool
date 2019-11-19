package com.stackroute.MongoDb.seeds;

import com.stackroute.MongoDb.domain.Track;
import com.stackroute.MongoDb.exceptions.TrackAlreadyExistsException;
import com.stackroute.MongoDb.repository.TrackRepository;
import com.stackroute.MongoDb.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    private TrackRepository trackService ;
    @Autowired
    public MyApplicationListener(TrackRepository trackService) {
        this.trackService = trackService;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        Track track1 = new Track();

        track1.setId(1);
        track1.setComments("lite");
        track1.setTrackName("hello hello");
        trackService.save(track1);

    }
}

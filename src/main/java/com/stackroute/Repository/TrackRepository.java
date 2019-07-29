package com.stackroute.Repository;

import com.stackroute.Muzix.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track,Integer> {
  /*  @Query("from Track where movie=?1")
    List<Track> getTrackByName(String movie);*/
}

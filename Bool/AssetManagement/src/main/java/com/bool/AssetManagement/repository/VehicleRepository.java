package com.bool.AssetManagement.repository;

import com.bool.AssetManagement.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    @Query("SELECT v FROM Vehicle v WHERE v.no = :no AND v.rideCount= :rideCount")
    Vehicle rideOfVehicle(@Param("no") int no, @Param("rideCount") int rideCount);


}

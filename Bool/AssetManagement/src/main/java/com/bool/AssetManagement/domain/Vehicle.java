package com.bool.AssetManagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {

     @Id
     int no;
     int regno;
     int charge;
     String username;
     int initMeterReading;
     int finalMeterReading;
     int rideCount;
     Date initTime;
     Date dropTime;
     int totalDistance;
     String feedbackOrComments;
     String status;

 public Vehicle(int i, int i1, int i2, String ajay, int i3, int i4, int i5, int i6, int i7, int i8, String lite, String available) {
 }


 public int getNo() {
  return no;
 }

 public void setNo(int no) {
  this.no = no;
 }

 public int getRegno() {
  return regno;
 }

 public void setRegno(int regno) {
  this.regno = regno;
 }

 public int getCharge() {
  return charge;
 }

 public void setCharge(int charge) {
  this.charge = charge;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public int getInitMeterReading() {
  return initMeterReading;
 }

 public void setInitMeterReading(int initMeterReading) {
  this.initMeterReading = initMeterReading;
 }

 public int getFinalMeterReading() {
  return finalMeterReading;
 }

 public void setFinalMeterReading(int finalMeterReading) {
  this.finalMeterReading = finalMeterReading;
 }

 public int getRideCount() {
  return rideCount;
 }

 public void setRideCount(int rideCount) {
  this.rideCount = rideCount;
 }

 public Date getInitTime() {
  return initTime;
 }

 public void setInitTime(Date initTime) {
  this.initTime = initTime;
 }

 public Date getDropTime() {
  return dropTime;
 }

 public void setDropTime(Date dropTime) {
  this.dropTime = dropTime;
 }

 public int getTotalDistance() {
  return totalDistance;
 }

 public void setTotalDistance(int totalDistance) {
  this.totalDistance = totalDistance;
 }

 public String getFeedbackOrComments() {
  return feedbackOrComments;
 }

 public void setFeedbackOrComments(String feedbackOrComments) {
  this.feedbackOrComments = feedbackOrComments;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }


}

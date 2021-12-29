package com.flightapp.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Flight implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer flightId;
private String airLineName;
private Date fltDate;
private String fromLoc;
private String toLoc;
private double price;
private LocalDateTime arrTime;
private LocalDateTime depTime;
private int totalAvlBusClSeats;
private int totalAvlNonBusClSeats;
private String airlineStatus;
private String scheduledDays;
private int numberOfRows;
private String meal;
private String instrumentUsed;
public Integer getFlightId() {
	return flightId;
}
public void setFlightId(Integer flightId) {
	this.flightId = flightId;
}
public String getAirLineName() {
	return airLineName;
}
public void setAirLineName(String airLineName) {
	this.airLineName = airLineName;
}
public Date getFltDate() {
	return fltDate;
}
public void setFltDate(Date fltDate) {
	this.fltDate = fltDate;
}
public String getFromLoc() {
	return fromLoc;
}
public void setFromLoc(String fromLoc) {
	this.fromLoc = fromLoc;
}
public String getToLoc() {
	return toLoc;
}
public void setToLoc(String toLoc) {
	this.toLoc = toLoc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDateTime getArrTime() {
	return arrTime;
}
public void setArrTime(LocalDateTime arrTime) {
	this.arrTime = arrTime;
}
public LocalDateTime getDepTime() {
	return depTime;
}
public void setDepTime(LocalDateTime depTime) {
	this.depTime = depTime;
}
public int getTotalAvlBusClSeats() {
	return totalAvlBusClSeats;
}
public void setTotalAvlBusClSeats(int totalAvlBusClSeats) {
	this.totalAvlBusClSeats = totalAvlBusClSeats;
}
public int getTotalAvlNonBusClSeats() {
	return totalAvlNonBusClSeats;
}
public void setTotalAvlNonBusClSeats(int totalAvlNonBusClSeats) {
	this.totalAvlNonBusClSeats = totalAvlNonBusClSeats;
}
public String getAirlineStatus() {
	return airlineStatus;
}
public void setAirlineStatus(String airlineStatus) {
	this.airlineStatus = airlineStatus;
}
public String getScheduledDays() {
	return scheduledDays;
}
public void setScheduledDays(String scheduledDays) {
	this.scheduledDays = scheduledDays;
}
public int getNumberOfRows() {
	return numberOfRows;
}
public void setNumberOfRows(int numberOfRows) {
	this.numberOfRows = numberOfRows;
}
public String getMeal() {
	return meal;
}
public void setMeal(String meal) {
	this.meal = meal;
}
public String getInstrumentUsed() {
	return instrumentUsed;
}
public void setInstrumentUsed(String instrumentUsed) {
	this.instrumentUsed = instrumentUsed;
}
@Override
public String toString() {
	return "Flight [flightId=" + flightId + ", airLineName=" + airLineName + ", fltDate=" + fltDate + ", fromLoc="
			+ fromLoc + ", toLoc=" + toLoc + ", price=" + price + ", arrTime=" + arrTime + ", depTime=" + depTime
			+ ", totalAvlBusClSeats=" + totalAvlBusClSeats + ", totalAvlNonBusClSeats=" + totalAvlNonBusClSeats
			+ ", airlineStatus=" + airlineStatus + ", scheduledDays=" + scheduledDays + ", numberOfRows=" + numberOfRows
			+ ", meal=" + meal + ", instrumentUsed=" + instrumentUsed + "]";
}

}



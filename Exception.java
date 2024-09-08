package cps2231_Homework6;

import java.io.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exception {

	int numPassenger = Integer.parseInt(input.nextLine().trim());
	
	passengers = new Passenger [numPassenger];
	
	int index = 0;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
	while (input.hasNext()) {
	String line = input.nextLine();
	String[] data = line.split((",");
	int passengerID = Integer.parseInt(data[0]);
	String name = data[1];
	LocalDate dateofBirth = LocalDate.parse(data[2],formatter);
	ClassofService classofService = ClassOfService.valueOf(data[3]);
	boolean frequencyFlyerStatus = Boolean.valueOf(data)
}

/*
 * 3.	We want to realize a program for handling new and used cars to sell.

For each car to sell, the information about the car is stored on a text file.

Realize a class Car, to handle a single car.
 
Each car is characterized by the following information: 
	model,
	manufacturing year, 
	driven kilometers, 
	and price. 
	
New cars can be distinguished by the fact that the driven kilometers are 0.

The class Car should export the following methods:

• a constructor to construct a car object, given all the data about the car as parameters;

• suitable get-methods to obtain the data about the car;

• a toString method, which does overriding of the toString method inherited from Object, and returns a string containing the data about the car;

• boolean equalTo(Car c) : that returns true if the car coincides with the car c in all of its data, and false otherwise.

• public static Car read(BufferedReader br) throws IOException : that returns a Car object reading from the file.

Realize a class CarList, each of whose objects represents a list of cars to sell. 

A CarList object does not directly store the data about the cars to sell, but maintains the name of a text file in which such data are stored, according to the following format:

model
manufacturing year (year)
driven kilometers (km)
price

The class CarList should export the following methods:

• CarList(String filename) : constructor with a parameter of type String, representing the name of the file in which the data about the cars to sell are stored;

• int countNewCars() : that returns the number of new cars in the list of cars to sell;

• Car mostExpensiveCar() : that returns the Car object corresponding to the most expensive car in the list of cars to sell.

• void addCar(Car c) : that adds the car c to the end of the list of cars to sell.

• void remove(Car c) : that removes from the list of cars to sell the car whose data coincides with that of c, if such a car is present, and leaves the list unchanged otherwise.


 */
package com.file.test;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
	private String model;
	private int year;
	private int km;
	private double price;
	
	//Constructor to construct a car object
	public Car(String model, int year, int km, double price) {
		this.model = model;
		this.year = year;
		this.km = km;
		this.price = price;
	}
	// get method of model
	public String getModel() {
		return model;
	}
	//get method of year
	public int getYear() {
		return year;
	}
	//get method of km
	public int getKm() {
		return km;
	}
	//get method of price
	public double getPrice() {
		return price;
	}
	// toString method to print all details of car
	@Override
	public String toString() {
		return " model : " + model + ", year: " + year + ", km: " + km + ", price: " + price;
	}
	//It returns true if car coincides with the car c in all of its data
	public boolean equalTo(Car c) {
		return this.model.equals(c.model) &&
				this.year == c.year &&
				this.km == c.km &&
				this.price == c.price;
	}
	//return car object reading from file
	public static Car read(BufferedReader br) throws IOException {
		String s = br.readLine();
		if (s == null)
			return null;
		else
			return new Car(s, Integer.parseInt(br.readLine()),
							Integer.parseInt(br.readLine()),
							Double.parseDouble(br.readLine()));
	}
	
	
}

package com.file.fll;

import java.io.File;

import com.file.test.Car;
import com.file.test.CarList;

public class TestCar {

	public static void main(String[] args) {
		try {
			Car c1 = new Car("M001",2020,0, 1000.30);
			Car c2 = new Car("M002",2016,0,750000.98);
			Car c3 = new Car("M003",2020,0,750000.87);
			Car c4 = new Car("M004",2020,0,750000.98);
			Car c5 = new Car("M005",2020,0, 1000.30);
			Car c6 = new Car("M006",2017,1000,750000.76);
			Car c7 = new Car("M007",2008,5000,800000.87);
			Car c8 = new Car("M008",2020,0,75000.8);
			Car c9 = new Car("M009",2020,0,750000.4);
			Car c10 = new Car("M010",2020,0,750000.09);
			
			//Creating the array of Car class
			Car [] cars = new Car[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
			
			//It will create new file and delete the file if it is already existed.
			File f = new File("car.txt");
			f.delete();
			
			//Creating the object of CarList
			CarList carList = new CarList("car.txt");
			
			for(Car c : cars) {
				carList.addCar(c);
			}
			
			//print the no. of new cars in CarList
			System.out.println("New Cars : " + carList.countNewCars());
			
			//print the details of most expensive car.
			System.out.println("Most expensive Car : " +carList.mostExpensiveCar());
			
			//it will remove the object from the list if its coincides with the given object of Car
			
			carList.removeCar(c5);
			System.out.println("New Cars after removing : " + carList.countNewCars());
			
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			


	}

}

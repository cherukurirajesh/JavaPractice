package com.pluralsight.practice.constructor;

public class Flights {

		int Passengers;
		int Seats;
	
//the below Flights() is called a constructor, This constructor is used to instantiate the class Flights with the parameters x and y.
		Flights(int x, int y) {
			Passengers = x;
			Seats = y;
		}

		void add1Passenger() {
			if (Passengers < Seats) {
			Passengers += 1;
			}
			else
			{
				flightIsFull();
			}
			
		}
		void flightIsFull() {
			System.out.println("Flight is Full, So providing an alternate flight");
			newFlight();
		}
		
		void newFlight(){
			Flights extraFlight = new Flights(100, 500);
			Seats = Seats + extraFlight.Seats;
			Passengers = Passengers + extraFlight.Passengers;
			System.out.println("Total seats are: " + Seats +"\n"+"Total Passengers are: " + Passengers);
		}
		
public static void main(String[] args) {
	Flights flightsHydToDelhi = new Flights(300,500);
	Flights flightHydToBanglore = new Flights(500,500);
	
	flightsHydToDelhi.add1Passenger();
	System.out.println("Number of Passengers are:" + flightsHydToDelhi.Passengers);

	flightHydToBanglore.add1Passenger();
//	System.out.println("Number of Passengers are:" + flightHydToBanglore.Passengers);
	}
}
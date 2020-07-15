import java.util.*; 



public class Project3 { 
  
  
  static void flightInfo(String airline, String airlineAcronym, int flightNumber, String destination) {
    System.out.println(airline + " " + airlineAcronym + flightNumber + " " + " " + destination);
  }
  static void boardingInfo(String gate, int gateNum, int departureHour, String colon, int departureMin, String amPM, String month, int day, int year, String boardingZone, int boardingzoneNum) {
    System.out.println(gate + gateNum + " " + " " + departureHour + colon + departureMin + " "+ amPM +  " " + " " +  month + " " + day + " " + year + " " + " " + boardingZone + boardingzoneNum);
  }
  static void passengerInfo(String name, int aisleNum, String seat, String seatClass) {
    System.out.println(name + " " + " " + aisleNum + seat + " " + " " + seatClass);
  }

  static double ticketCost(double basePrice, double ticketTax) {
  return basePrice + ticketTax;
  }
 
  static void arrivalTime(String arrival, int arrivalHour, String arrivalColon, int arrivalMin, String amPM) {
    System.out.println(arrival + arrivalHour + arrivalColon + arrivalMin + " " + amPM);
  }

 
  public static void main(String[] args) {
    System.out.println("Airline Ticket Generator\n\n");
    flightInfo("Delta Airlines", "DL", 3195, "Destination: NYC to LA");
    boardingInfo("Gate: A", 22, 3, ":", 15, "PM", "July", 15, 2020, "Boarding Zone: D", 3);
    passengerInfo("Passenger: Kevin Nesslein", 24, "C", "First Class");
    System.out.println("Airfare: $" + ticketCost(500, 8.75));
    arrivalTime("Arrival Time: ", 6, ":", 45, "PM");
    
  }
}

package oop;

public class Home {

    String street_address = "Wonderland Ave"; //string data type
    char street_direction = 'N'; //char data type
    int address_number = 10157; //int data type
    double sqft = 950.25; //double data type
    String[] cars = {"Ford Raptor", "Audi R8", "Hyundai Santa Fe"}; //array data type

    public static void main(String[] args) {
        Home myHome = new Home(); //class data type
        System.out.println(myHome.address_number + " " + myHome.street_direction + " " + myHome.street_address +
                " (" + myHome.sqft + " sq.ft.) whose favorite car is the " + myHome.cars[1]);
    }
}
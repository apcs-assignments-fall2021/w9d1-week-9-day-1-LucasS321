import java.util.Scanner;

public class PinataClient {

    public static void main(String[] args) {
        Pinata myPinata = new Pinata("Penguin", 20, "Recees");
        System.out.println(myPinata.getCandyType()); // Recees
        myPinata.hit(); // You hit the Penguin pinata!
        System.out.println(myPinata.getHitsLeft()); // 19
        System.out.println(myPinata.getType()); // Penguin
        myPinata.grabCandy();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.hit();
        myPinata.grabCandy();

    }
}

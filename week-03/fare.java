import java.util.Scanner;

public class fare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double baseFare = 50;
        double perKm = 20;
        double perMinute = 2;
        
        System.out.print("Enter distance travelled (km): ");
        double distance = input.nextDouble();

        System.out.print("Enter time taken (minutes): ");
        int time = input.nextInt();

        System.out.print("Is the customer a local? (true/false): ");
        boolean isLocal = input.nextBoolean();

        System.out.print("Is the travel during night? (true/false): ");
        boolean isNight = input.nextBoolean();

        double fare = baseFare + (distance * perKm) + (time * perMinute);

        double localDiscount = (isLocal && distance > 20) ? fare * 0.10 : 0;
        double nightSurcharge = (isNight) ? fare * 0.20 : 0;

        double finalFare = fare - localDiscount + nightSurcharge;

        System.out.println("\n Rickshaw Fare ");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Time: " + time + " minutes");
        System.out.println("Final Fare: Rs " + finalFare);

        input.close();
    }
}
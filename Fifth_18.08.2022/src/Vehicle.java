import java.util.Scanner;
public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a vehicle between Audi, BMW, Bentley:");
        String model = sc.nextLine();

        switch (model){
            case "Audi":

            case "BMW":

            case "Bentley":
                Scanner sca = new Scanner(System.in);
            System.out.println("Input speed:");
            int sp = sca.nextInt();

            System.out.println("Input gear:");
            int gr = sca.nextInt();

            System.out.println("Input direction (Front, Back, Left, Right): ");
            String dir = sca.nextLine();

            Car audi = new Car(sp, gr, dir);
            System.out.println("Car speed: " + Car.speed + " Gear: " + Car.gear + " Direction: " + Car.dir);
            break;

            default:
        System.out.println("You choose wrong car!! ");
    }


    }
}
import java.util.Scanner;

enum TrafficLight{
    RED, YELLOW, GREEN;
}
class Enum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell me the color of signal you are seeing right now on the road (RED / YELLOW / GREEN): ");
        String input = sc.nextLine().toUpperCase();

        TrafficLight signal = TrafficLight.valueOf(input); // converting string input to enum constant
        switch(signal)
        {
            case RED:
                System.out.println("Then you need to Stop");
                break;
            case YELLOW:
                System.out.println("Get Ready to move");
                break;
            case GREEN:
                System.out.println("Go and accelerate your vehicle");
                break;
        }
    }
}
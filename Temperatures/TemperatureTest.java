import java.util.Scanner;

public class TemperatureTest{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of temperature recordings: ");

        int numberOfRecordings = 0;
        while(true) {
            try {
                String input = scanner.nextLine();
                numberOfRecordings = Integer.parseInt(input);
                if (numberOfRecordings < 1) {
                    throw new Exception("Must be greater than 0");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a whole number greater than 0");
            }
        }
        double[] recordings = new double[numberOfRecordings];

        for(int i = 0; i < numberOfRecordings; i++){
            while (true){
                try {
                    System.out.println("Enter temperature "+(i+1)+" out of "+numberOfRecordings);
                    String input = scanner.nextLine();
                    double recording = Double.parseDouble(input);
                    recordings[i] = recording;
                    break;
                }catch (Exception e){
                    System.out.println("Invalid input, please enter a valid temperature");
                }
            }
        }

        Temperature temperature = new Temperature(recordings);
        System.out.println("The average of the temperature recordings are: " + temperature.calcAverage());
        System.out.println("There are "+ temperature.countGreaterThanAverage() +" results greater than the average");

    }
}


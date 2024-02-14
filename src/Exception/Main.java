package Exception;


public class Main {
    public static void main(String[] args) {
        AirBalloon airBalloon = new AirBalloon();
        int userInputHeight;

        try {
            System.out.println("Enter the how high the balloon is (from 120 to 355 meters): ");
            userInputHeight = new java.util.Scanner(System.in).nextInt();

            airBalloon.setHeight(userInputHeight);
            System.out.println("Indexes of air condition at : " + airBalloon.getHeight() + " meters.");
        } catch (HeightOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter the correct altitude range.");
        }
    }
}
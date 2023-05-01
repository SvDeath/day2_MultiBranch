package src.papka;

public class Class1 {
    public static void main(String[] args) {
        double radius = 5.0; // Radius of the circle
        int circleDiameter = (int) (radius * 2); // Diameter of the circle

        // Loop through rows and columns to draw the circle
        for (int row = 0; row <= circleDiameter; row++) {
            for (int col = 0; col <= circleDiameter; col++) {
                double distance = Math.sqrt(Math.pow(row - radius, 2) + Math.pow(col - radius, 2));
                // If the distance from the center is less than the radius, print '*'
                if (distance < radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}

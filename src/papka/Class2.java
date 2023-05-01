package src.papka;

public class Class2 {
    public static void main(String[] args) {
        double size = 5.0; // Size of the star
        int starWidth = (int) (size * 2); // Width of the star

        // Loop through rows and columns to draw the star
        for (int row = 0; row <= starWidth; row++) {
            for (int col = 0; col <= starWidth; col++) {
                double distance = Math.sqrt(Math.pow(row - size, 2) + Math.pow(col - size, 2));
                // If the distance from the center is less than half the size, print '*'
                if (distance < size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}

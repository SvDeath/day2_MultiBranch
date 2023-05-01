package src.papka;

public class Class2 {
    public static void main(String[] args) {
        int size = 5; // Size of the star
        int halfSize = size / 2; // Half the size of the star

        // Loop through rows and columns to draw the star
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == halfSize || col == halfSize || row + col == halfSize * 2 || row - col == halfSize) {
                    System.out.print("*"); // Print '*' for star points
                } else {
                    System.out.print(" "); // Print ' ' for spaces
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}

// PATTERN :

// 1        
// 2  3     
// 4  5  6  
// 7  8  9  10    
// 11 12 13 14 15 

public class pattern21 {
    public static void main(String[] args) {
        patternn21(5,1);
    }
    static void patternn21(int row, int col)
    {
        int rows = row;
        int num = col;

        for (int i = 1; i <= rows; i++) {
            // Print numbers in a row
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", num); // %-3d gives spacing
                num++;
            }
            System.out.println();
        }
    }
}

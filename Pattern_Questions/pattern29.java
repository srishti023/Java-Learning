// PATTERN :

// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

public class pattern29 {
    public static void main(String[] args) {
        patternn29(4);
    }
    static void patternn29(int n)
    {
        int size = 2 * n - 1; // size of the square

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Find the minimum distance to any edge
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}

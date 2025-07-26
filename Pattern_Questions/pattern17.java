// PATTERN :

//     1    
//    212   
//   32123  
//  4321234 
// 543212345
//  4321234 
//   32123  
//    212   
//     1 
public class pattern17 {
    public static void main(String[] args) {
        patternn17(5);
    }
    static void patternn17(int n)
    {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

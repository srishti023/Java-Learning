// PATTERN :

//     *****
//    *   * 
//   *   *  
//  *   *   
// ***** 

public class pattern25 {
    public static void main(String[] args) {
        patternn25(5);
    }
    static void patternn25(int n)
    {
        for (int i = 0; i < n; i++) {
            // print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print stars and spaces
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*"); // top and bottom rows full
                } else {
                    if (j == 0 || j == 4) {
                        System.out.print("*"); // side stars
                    } else {
                        System.out.print(" "); // hollow space inside
                    }
                }
            }

            System.out.println(); // new line
        }
    }
}

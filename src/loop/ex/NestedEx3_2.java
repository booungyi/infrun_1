package loop.ex;

public class NestedEx3_2 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int rows = 17;
        for (a = 0; a < rows; a++) {

            for (b = a; b <= rows - 1; b++) {
                System.out.print(" ");
            }
            for (c = 0; c <= (a * 2); c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

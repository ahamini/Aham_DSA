package String;

public class parr {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 10; j++) {
                if (j <= i || j > 10 - i) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 10; j >= 1; j--) {
                if (j >= 10 - i || j <= i) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}


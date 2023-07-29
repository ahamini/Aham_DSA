package Array;
import java.util.*;
public class decimal {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String a=sc.next();
         String[] arr=new String[3];
         arr=a.split("-");
         int r=Integer.parseInt(arr[0]);
        int g=Integer.parseInt(arr[1]);
        int b=Integer.parseInt(arr[2]);
        System.out.println(convertRGBtoHex(r,g,b));
    }
        static String decToHexa(int n) {

            char[] hexaDeciNum = new char[2];
            int i = 0;
            while (n != 0) {
                int temp = 0;

                temp = n % 16;
                if (temp < 10) {
                    hexaDeciNum[i] = (char) (temp + 48);
                    i++;
                } else {
                    hexaDeciNum[i] = (char) (temp + 55);
                    i++;
                }

                n = n / 16;
            }

            String hexCode = "";
            if (i == 2) {
                hexCode += hexaDeciNum[1];
                hexCode += hexaDeciNum[0];
            } else if (i == 1) {
                hexCode = "0";
                hexCode += hexaDeciNum[0];
            } else if (i == 0)
                hexCode = "00";
            return hexCode;
        }
        static String convertRGBtoHex(int R, int G, int B)
        {
            if ((R >= 0 && R <= 255)
                    && (G >= 0 && G <= 255)
                    && (B >= 0 && B <= 255)) {

                String hexCode = "#";
                hexCode += decToHexa(R);
                hexCode += decToHexa(G);
                hexCode += decToHexa(B);

                return hexCode;
            }
            else
                return "NA";
        }
}

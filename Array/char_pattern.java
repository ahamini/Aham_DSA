package Array;
public class char_pattern {
    public static void main(String[] args) {
        int n=4;
        int charac=65;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)charac);
                charac++;
            }
            System.out.println();
        }
    }
}

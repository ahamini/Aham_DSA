package Array;

    import java.util.Scanner;
    public class xx {
        static int lds(int arr[], int n) {
            int lds[] = new int[n];
            int i, j, max = 0;
            for (i = 0; i < n; i++)
                lds[i] = 1;
            for (i = 1; i < n; i++)
                for (j = 0; j < i; j++)
                    if (arr[i] < arr[j] && lds[i] < lds[j] + 1)
                        lds[i] = lds[j] + 1;
            for (i = 0; i < n; i++)
                if (max < lds[i])
                    max = lds[i];
            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print(lds(arr, n));
        }
    }


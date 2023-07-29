package String;

public class Solution {
    public static int maximum_profit(int n, int[][] intervals) {
        // code here
        int   profit=0,y=0;
        if(n==1)
            return intervals[0][2];
        else{
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if((intervals[i][1]<=intervals[j][0] && intervals[i][0]<intervals[j][0])||(intervals[j][1]<=intervals[i][0] && intervals[j][0]<intervals[i][0])){
                        profit=profit+intervals[i][2]+intervals[j][2];
                        intervals[i][2]=intervals[j][2]=0;
                    }
                }
                if(y<intervals[i][2])
                    y=intervals[i][2];
            }
            if(y<intervals[n-2][2] && intervals[n-2][2]>intervals[n-1][2])
                y=intervals[n-2][2];
            else if(intervals[n-1][2]>y && intervals[n-1][2]>intervals[n-2][2])
                y=intervals[n-1][2];
            else
                y=y;
        }
        if(profit!=0)
            return profit;
        else
            return y;

    }


    public static void main(String[] args) {
        int arr[][]={
                {5,7,7},
                {1,4,8}
        };
        int x=maximum_profit(2,arr);
        System.out.println(x);
    }
}

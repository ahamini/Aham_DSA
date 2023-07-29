package Apna_college.OOPS;
class Coding {
    public static int mostfreq(int[] arr,int n){
int max=0;
int max_ele=0;
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<n;j++){
count++;
}

if(count>max){
max=count;
max_ele=arr[i];
}
}
return max_ele;
}}
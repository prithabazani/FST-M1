package activities;

public class Activity2 {
    public static void main(String[] args) {
        int arr[] = {10, 77, 10, 54, -11, 10};
        int sum=0;
        for (int val : arr ) {
            if(val==10){
                sum+=val;
            }
        }
        if(sum == 30){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

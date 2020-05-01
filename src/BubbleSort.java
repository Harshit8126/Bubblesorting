import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
       int n = sc.nextInt();
       int temp;
       int flag = 0;
       int a[] = new int[n];
       System.out.println("Enter all the elements:");
       for(int i = 0 ; i<n ; i++)
       {
           a[i] = sc.nextInt();
       }
        for(int i= 0;i<a.length;i++){           //For Number of Passes
            for( int j = 0 ;j<a.length-1-i;j++){  //To check the adjacent elements by passes
                if(a[j]>a[j+1]){
                   temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                   flag = 1;
                }
            }
            if(flag == 0 ){
                break;
            }
        }
        System.out.print(" Soterd Elements by using bubble list :-");
        for(int i = 0 ; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}

package hh;
import java.util.Scanner;

public class learnd1 {
    static int count;
    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);
        num =sc.nextInt();
        int a[]=new int[num];
        fz(a,0,num);
        System.out.println(count);
       }
        public static void fz(int a[],int num,int temp){
        if(num==temp){
            print(a,temp);
            count++;
            return;
        }
        for(int i=0;i<temp;i++){
            a[num]=i;
            if(pd(num,a)){
            fz(a,num+1,temp);
            }
        }

        }
       public static boolean pd(int num,int a[]){
        for(int i=0;i<num;i++){
            if(a[i]==a[num]||Math.abs(i-num)==Math.abs(a[i]-a[num])){
                return false;
            }
        }
           return true;
       }

       public static void print(int a[],int num){
        for(int i=0;i<num;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
       }
}



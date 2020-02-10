import java.util.Scanner;

public  class ArrayExample{
    public  static void main (String[1
            ]args){
        Scanner in=new Scanner(System.in);
        int a[];
        int b[];

        a=new int[5];
        System.out.println("enter array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("array is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("value of a["+i+"]is" +a[i] );

        }
        int d[]=new int []{1,2,3,4,5};
        for(int i=0;i<d.length;i++)

        {
            System.out.println("value of d["+i+"]is" +d[i] );

        }
    }

}
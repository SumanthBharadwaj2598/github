import java.math.BigInteger;
import java.util.Scanner;

public class car {
    public static void main(String[] args){
        int carmodel=0,count,costc=0,costo=0,cost=0,costr=0,regular=0,costregular=0;
        int f=0,total=0,emi4=0,emi7=0;
        String x="";
        int y=1234567890,payment=0;
        boolean mi;
        Scanner in=new Scanner(System.in);
        System.out.println("Car Model 1.hatchback 2.saloon 3.estate");
        System.out.println("Enter number to see price");

        //Scanner sc=new Scanner(System.in);
        carmodel=in.nextInt();


        if(carmodel == 1){
            hatchback car=new hatchback();
            System.out.println("model is "+car.getType());
            System.out.println("price is "+car.getPrice());
            costc=car.getPrice();
        }else if (carmodel == 2){
            saloon car=new saloon();
            System.out.println("model is "+car.getType());
            System.out.println("price is "+car.getPrice());
            costc=car.getPrice();
        }else if (carmodel == 3) {
            estate car=new estate();
            System.out.println("model is "+car.getType());
            System.out.println("price is "+car.getPrice());
            costc=car.getPrice();
        }else{
            System.out.println("Car not available");
        }
        System.out.println("Extra options");

        int seats=45000;
        int satellite=5500;
        int parking=10000;
        int bluetooth=350;
        int sound=1000;
        System.out.println("Optional charges");
        System.out.println("1.luxury seats:"+seats);
        System.out.println("2.Parking sensors :"+parking);
        System.out.println("3.Satellite Navigation :"+satellite);
        System.out.println("4.Bluetooth Connectivity :"+bluetooth);
        System.out.println("5.Sound System :"+sound+"\n");
        int A[]=new int[]{45000,5500,10000,350,1000};
        int B[]=new int[]{0,0,0,0,0};
        String C[]=new String[5];
        count = in.nextInt();
        while(count!=6)
        {
            if(B[count-1]!=1)
            {
                B[count-1]=1;
                costo=costo+A[count-1];
            }
            count = in.nextInt();
        }
        boolean z;
        System.out.println("regular customer? true/false");
        mi=in.nextBoolean();
        if(mi) {
            System.out.println("is the customer returning old car? true/false");
            z = in.nextBoolean();
            if (z) {
                System.out.println("car type 1.hatchback 2.saloon 3.estate");
                System.out.println("enter number to see price");
                carmodel = in.nextInt();


                if (carmodel == 1) {
                    hatchback car = new hatchback();
                    System.out.println("price is " + car.getReturnPrice());
                    costr = car.getReturnPrice();
                } else if (carmodel == 2) {
                    saloon car = new saloon();
                    System.out.println("price is " + car.getReturnPrice());
                    costr = car.getReturnPrice();
                } else if (carmodel == 3) {
                    estate car = new estate();
                    System.out.println("price is " + car.getReturnPrice());
                    costr = car.getReturnPrice();

                } else {
                    System.out.println("No exchange..");
                }
            }
        }



        System.out.println("Car price is :"+costc);
        System.out.println("Optional cost is :"+costo);
        if(mi) {
            f=(costc+costo)/10;
            System.out.println("Regular customer discount :"+f);
        }
        else{
            f=(costc+costo)/20;
            System.out.println("Regular customer discount :"+f);
        }
        System.out.println("Exchange of car discount :"+costr);
        cost=costc+costo-f-costr;
        System.out.println("total cost price is:"+cost);
        System.out.println("mode of payment\n1.Full payment\n2.4 years\n3.7years");
        payment=in.nextInt();
        if(payment==1)
        {
            System.out.println("total cost price is:"+cost);
            total=cost-cost/100;//1% cashback
            System.out.println("Cash back is :"+(cost/100));
            System.out.println("Total amount to be paid is :"+total);
        }
        else if(payment==2)
        {
            System.out.println("total cost price is:"+cost);
            total=cost;
            emi4=cost/48;
            System.out.println("EMI for 4years is :"+emi4);
            System.out.println("Total amount to be settled is :"+total);
        }
        else if (payment==3)
        {
            System.out.println("total cost price is:"+cost);
            total=cost+cost/20;
            emi7=cost/84;
            System.out.println("EMI for 7years is :"+emi7);
            System.out.println("Total amount to be settled is :"+total);
        }
    }
}


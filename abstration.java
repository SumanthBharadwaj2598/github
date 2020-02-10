public class abstration {
    public static void main (String[] args){
        carab car1=new ferrai();
        carrepair carepair=new carrepair();
        carrepair.repaircar(car1);
        car1=new audi();
        carrepair.repairCar(car1);

    }
}
class vehicle{
    int baasespeed = 60;
    int getmaxspeed(){
        return baasespeed;
    }
}
class car extends vehicle{
    int getmaxspeed(){
        return 120;
    }
}
class bike extends vehicle{
    int getmaxspeed(){
        return 150;
    }
}
public class trackingsystem {
    public static void main(String[] args) {
        vehicle v;
        v = new car();
        System.out.println("Car speed: " + v.getmaxspeed());
        v = new bike();
        System.out.println("Bike speed: " + v.getmaxspeed());
    }
} 
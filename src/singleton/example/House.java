package singleton.example;

import java.net.NoRouteToHostException;

public class House {

    private House(){ }
    public static House h1 = new House();

    public static House getInatace(){
        return h1;
    }

    public void methodC(){
        System.out.println("Print");
    }
}

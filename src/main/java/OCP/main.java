package OCP;

public class main {
    public static void main(String args[])
    {

        Cuboid cb1 = new Cuboid();
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;

        Cuboid cb2 = new Cuboid();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;

        Cuboid cb3 = new Cuboid();
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;
        Cuboid[] c_arr = new Cuboid[3];
        c_arr[0] = cb1;
        c_arr[1] = cb2;
        c_arr[2] = cb3;
        Application app = new Application();
        double vol = app.get_total_volume(c_arr);
        System.out.println("The total volume is " + vol);
    }
}

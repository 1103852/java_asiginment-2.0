package myApp;

public class Main {

    public static void main(String[] args) {

        subclass  c1 = new subclass();

        c1.insert(100);
        c1.insert(200);
        c1.insert(300);
        c1.insert(400);

        c1.travarse();

        System.out.println(c1.linerSearch(200));
        System.out.println(c1.binarySearch(300));

        c1.delete(1);
        c1.update(4,1000);


        c1.travarse();

        System.out.println(c1.linerSearch(200));
    }
}

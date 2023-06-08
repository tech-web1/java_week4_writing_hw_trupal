package homework;
//Java program to overload constructors
public class P25_ConstructorOverLoadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    P25_ConstructorOverLoadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    P25_ConstructorOverLoadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        P25_ConstructorOverLoadingExample s1 = new P25_ConstructorOverLoadingExample(111, "Karan");
        P25_ConstructorOverLoadingExample s2 = new P25_ConstructorOverLoadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();

    }

}
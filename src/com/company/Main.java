package com.company;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Green", "1234567", true);
        Car betty = new Car("Purple", "92874592", true, "Nissan Sentra", 12.2);

        System.out.println(betty);
        betty.setColor("Pink");
        System.out.println("After Color Change \n" + betty);


    }
}

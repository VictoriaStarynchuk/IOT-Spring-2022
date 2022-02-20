public class Main {
    public static void main(String[] args) {

        ElectricLamp defaultLamp = new ElectricLamp();
        System.out.println(defaultLamp);

        ElectricLamp officeLamp = new ElectricLamp("IKEA", 100, 360, "China", "grey", 500);
        System.out.println(officeLamp.toString());

        ElectricLamp homeLamp = new ElectricLamp("Zara", "Spain", 1000);
        System.out.println(homeLamp.toString());

    }
}

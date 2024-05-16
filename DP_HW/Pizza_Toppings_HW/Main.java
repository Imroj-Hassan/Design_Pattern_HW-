package pizzaToppings;

public class Main {
    public static void main(String[] args) {

        // Creating pizza1 and adding toppings
        Pizza Pizza1 = new PepperoniPizza();
        Pizza1.prepare();
        Pizza1.addTopping("Sausage");
        Pizza1.addTopping("Chicken");
        Pizza1.addTopping("Cheese");

        System.out.println();

        // Creating pizza2 and adding toppings
        Pizza Pizza2 = new VegPizza();
        Pizza2.prepare();
        Pizza2.addTopping("Cheese");
        Pizza2.addTopping("Tomato");
        Pizza2.addTopping("Vegetables");
    }
}

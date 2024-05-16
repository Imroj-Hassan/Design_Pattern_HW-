package Pizza_Toppings;
public abstract class Pizza {
    public abstract void addTopping(String topping);
    public void prepare() {
        System.out.println("Preparing pizza");
    }

}

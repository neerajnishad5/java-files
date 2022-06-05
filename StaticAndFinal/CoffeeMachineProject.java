class CoffeeMachine {
    private int coffeeQty;
    private int waterQty;
    private int sugarQty;
    private int milkQty;

    static private CoffeeMachine our = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
        sugarQty = 1;
        milkQty = 1;
    }

    public void fillSugar(int sugar) {
        sugarQty = sugar;

    }

    public void fillCoffee(int coffee) {
        coffeeQty = coffee;

    }

    public float getCoffee() {
        return 0.15f;
    }

    static CoffeeMachine getInstance() {
        if (our == null) {
            our = new CoffeeMachine();
        }

        return our;
    }
}

public class CoffeeMachineProject {
    public static void main(String[] args) {
        CoffeeMachine m1 =new CoffeeMachine.getInstance();

        
    }
}

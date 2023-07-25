// Base component
public interface Beverage {
    String getDescription();
    double getCost();
}

// Concrete component
public class Coffee implements Beverage {
    public String getDescription() {
        return "Coffee";
    }

    public double getCost() {
        return 1.99;
    }
}

// Base decorator
public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
    public abstract double getCost();
}

// Concrete decorators
public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double getCost() {
        return beverage.getCost() + 0.30;
    }
}

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}

/**
Usage:

Beverage myBeverage = new Coffee();
myBeverage = new MilkDecorator(myBeverage);
myBeverage = new SugarDecorator(myBeverage);

System.out.println(myBeverage.getDescription() + " $" + myBeverage.getCost());
// Coffee, Milk, Sugar $2.49
*/
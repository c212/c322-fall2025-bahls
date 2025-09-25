public class PlainPizza implements Pizza{
    PlainPizza(){
        System.out.println("Starting with Dough");
    }
    public String getDescription(){
        return "Thin Dough";
    }
    public double getCost(){
        return 4.00;
    }
}

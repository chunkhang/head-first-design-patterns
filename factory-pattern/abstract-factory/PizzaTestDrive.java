public class PizzaTestDrive {

   public static void main(String[] args) {
      PizzaStore nyPizzaStore = new NYPizzaStore();

      Pizza pizza = nyPizzaStore.orderPizza("cheese");
      System.out.println("Ethan ordered a " + pizza.getName() + "\n");

   }

}
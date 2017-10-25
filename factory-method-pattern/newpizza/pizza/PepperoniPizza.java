public class Pepperoni extends Pizza {
   PizzaIngredientFactory ingredientFactory;

   public Pepperoni(PizzaIngredientFactory ingredientFactory) {
      this.ingredientFactory = ingredientFactory;
   }

   void prepare() {
      System.out.println("Preparing " + name);
      dough = ingredientFactory.createDough();
      sauce = ingredientFactory.createSauce();
      cheese = ingredientFactory.createCheese();
      pepperoni = ingredientFactory.createPepperoni();
   }
}
package abstractfactory.factory;

import abstractfactory.ingredient.cheese.Cheese;
import abstractfactory.ingredient.clams.Clams;
import abstractfactory.ingredient.dough.Dough;
import abstractfactory.ingredient.pepperoni.Pepperoni;
import abstractfactory.ingredient.sauce.Sauce;
import abstractfactory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

   public Dough createDough();
   public Sauce createSauce();
   public Cheese createCheese();
   public Veggies[] createVeggies();
   public Pepperoni createPepperoni();
   public Clams createClam();
   
}
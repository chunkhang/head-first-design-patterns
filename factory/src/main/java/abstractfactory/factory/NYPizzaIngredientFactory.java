package abstractfactory.factory;

import abstractfactory.ingredient.cheese.*;
import abstractfactory.ingredient.clams.*;
import abstractfactory.ingredient.dough.*;
import abstractfactory.ingredient.pepperoni.*;
import abstractfactory.ingredient.sauce.*;
import abstractfactory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

   public Dough createDough() {
      return new ThinCrustDough();
   }

   public Sauce createSauce() {
      return new MarinaraSauce();
   }

   public Cheese createCheese() {
      return new ReggianoCheese();
   }

   public Veggies[] createVeggies() {
      Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
      return veggies;
   }

   public Pepperoni createPepperoni() {
      return new SlicedPepperoni();
   }

   public Clams createClam() {
      return new FreshClams();
   }
   
}
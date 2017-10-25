package abstractfactory.factory;

import abstractfactory.ingredient.cheese.*;
import abstractfactory.ingredient.clams.*;
import abstractfactory.ingredient.dough.*;
import abstractfactory.ingredient.pepperoni.*;
import abstractfactory.ingredient.sauce.*;
import abstractfactory.ingredient.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

   public Dough createDough() {
      return new ThickCrustDough();
   }

   public Sauce createSauce() {
      return new PlumTomatoSauce();
   }

   public Cheese createCheese() {
      return new MozzarellaCheese();
   }

   public Veggies[] createVeggies() {
      Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
      return veggies;
   }

   public Pepperoni createPepperoni() {
      return new SlicedPepperoni();
   }

   public Clams createClam() {
      return new FrozenClams();
   }
   
}
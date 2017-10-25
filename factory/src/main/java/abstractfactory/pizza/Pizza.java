package abstractfactory.pizza;

import abstractfactory.ingredient.cheese.Cheese;
import abstractfactory.ingredient.clams.Clams;
import abstractfactory.ingredient.dough.Dough;
import abstractfactory.ingredient.pepperoni.Pepperoni;
import abstractfactory.ingredient.sauce.Sauce;
import abstractfactory.ingredient.veggies.Veggies;
import abstractfactory.factory.PizzaIngredientFactory;
import java.util.ArrayList;

public abstract class Pizza {
   String name;

   Dough dough;
   Sauce sauce;
   Veggies veggies[];
   Cheese cheese;
   Pepperoni pepperoni;
   Clams clam;

   public abstract void prepare();

   public void bake() {
      System.out.println("Bake for 25 minutes at 350");
   }

   public void cut() {
      System.out.println("Cutting the pizza into diagonal slices");
   }

   public void box() {
      System.out.println("Place pizza in official PizzaStore box");
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public String toString() {
      return null; 
   }
   
}
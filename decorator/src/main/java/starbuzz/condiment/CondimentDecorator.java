package starbuzz.condiment;

import starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
   public abstract String getDescription();
}
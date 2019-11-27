package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Ingredient;
import mk.finki.ukim.mk.lab.model.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> listPizzas();

    String createPizza(Pizza pizza);

    Pizza editPizza(String id, Pizza pizza);

    void deletePizza(String id);

    List<Pizza> getAllPizzas();

    Pizza getPizza(String id);

    List<Pizza> getPizzasWithLessIngredients(int n);

    List<Ingredient> getCommonIngredients(String pizzaId1, String pizzaId2);
}

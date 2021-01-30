package ru.mike.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.mike.tacocloud.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}

package ru.mike.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.mike.tacocloud.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

    Taco save(Taco taco);
}

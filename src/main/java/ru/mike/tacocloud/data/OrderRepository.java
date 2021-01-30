package ru.mike.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.mike.tacocloud.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Order save(Order order);
}

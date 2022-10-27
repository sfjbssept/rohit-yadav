package com.lambda.repo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Repository;

import com.lambda.entity.Order;

@Repository
public class OrderRepo {

	public List<Order> buildOrders() {
		return Stream.of(
				new Order(101,"SAmsung Galaxy s22", 100000, 1),
				new Order(102,"Iphone 14 pro", 100000, 2),
				new Order(103,"SAmsung Frame TV", 100000, 3),
				new Order(104,"LG oled TV", 100000, 1),
				new Order(105,"IFB Washing machine", 100000, 1)
				).collect(Collectors.toList());
	}

}

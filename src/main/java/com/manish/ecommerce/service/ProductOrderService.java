package com.manish.ecommerce.service;

import com.manish.ecommerce.entity.ProductOrder;
import com.manish.ecommerce.entity.ProductOrderRequest;

public interface ProductOrderService {
	
	public ProductOrder saveProductOrder(Long id, ProductOrderRequest productOrderRequest);
}

package com.manish.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manish.ecommerce.entity.Cart;
import com.manish.ecommerce.entity.Product;
import com.manish.ecommerce.entity.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	
	public Cart findByProductIdAndUserId(Long productId, Long userId);
	//public Cart findByProductAndUser(Product product, User user);

	public Long countByUserId(Long userId);

	public List<Cart> findByUserId(Long userId);
}

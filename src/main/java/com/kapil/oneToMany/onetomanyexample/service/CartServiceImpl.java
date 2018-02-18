package com.kapil.oneToMany.onetomanyexample.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.kapil.oneToMany.onetomanyexample.domain.Cart;
import com.kapil.oneToMany.onetomanyexample.repository.CartRepository;

@Service
@Transactional
public class CartServiceImpl implements CartService{
	
	private final CartRepository cartRepository;
	
	public CartServiceImpl(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	@Override
	public Cart saveCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> listCarts() {
		return cartRepository.findAll();
	}

	@Override
	public Cart getCart(long id) {
		return cartRepository.findOne(id);
	}

	@Override
	public void dropCart(long id) {
		cartRepository.delete(id);
	}
}

package com.kapil.oneToMany.onetomanyexample.service;

import java.util.List;
import com.kapil.oneToMany.onetomanyexample.domain.Cart;

public interface CartService {
	
	public Cart saveCart(Cart cart);
	
	public List<Cart> listCarts();
	
	public Cart getCart(long id);
	
	public void dropCart(long id);

}

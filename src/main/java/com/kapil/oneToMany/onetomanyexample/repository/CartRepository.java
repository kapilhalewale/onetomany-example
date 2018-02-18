package com.kapil.oneToMany.onetomanyexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kapil.oneToMany.onetomanyexample.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}

package com.xchb.gulimall.cart;

import com.xchb.gulimall.cart.service.CartService;
import com.xchb.gulimall.cart.vo.CartItemVo;
import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;

@Slf4j
@SpringBootTest
public class GulimallCartApplicationTests {

    @Autowired
    private CartService cartService;

    @Test
    public void contextLoads() throws ExecutionException, InterruptedException {

        CartItemVo cartItemVo = cartService.addToCart(1L, 2);

        log.info("cartItemVo:{}",cartItemVo);

    }

}

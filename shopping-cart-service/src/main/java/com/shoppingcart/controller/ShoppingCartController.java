package com.shoppingcart.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.shoppingcart.exception.ShoppingCartException;
import com.shoppingcart.request.ShoppingCartRequest;
import com.shoppingcart.response.ShoppingCartResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * This controller will serve POST/PUT/GET/DELETE request for Bulk update of statement status.
 */
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
    private final Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * This endpoint will be used to add an item into the shopping cart
     * * @param shoppingCartRequest request containing items to be added to the shopping cart
     *
     * @return Response Entity of ShoppingCartResponse with details of the shopping cart
     * @throws ShoppingCartException Custom exception to be thrown in case of invalid values
     */

    @PostMapping("/add")
    public ResponseEntity<ShoppingCartResponse> add(@RequestBody ShoppingCartRequest shoppingCartRequest) throws ShoppingCartException, JsonProcessingException {
        logger.info("adding to shopping cart");

        ShoppingCartResponse response = new ShoppingCartResponse();
        logger.info("");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/checkout")
    public ResponseEntity<ShoppingCartResponse> checkout(@RequestBody ShoppingCartRequest shoppingCartRequest) throws ShoppingCartException, JsonProcessingException {
        logger.info("adding to shopping cart");

        ShoppingCartResponse response = new ShoppingCartResponse();
        logger.info("");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

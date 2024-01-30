package com.example.demo.service;

import com.example.demo.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant saveRestaurant(Restaurant restaurant);

    Restaurant getRestaurant(String idRestaurant) throws NoSuchFieldException;

    List<Restaurant> getAllRestaurant();

    Restaurant editRestaurant(String idRestaurant, String name, String noMeja, String pesanan) throws  NoSuchFieldException;

    void deleteRestaurant(String idRestaurant);
}

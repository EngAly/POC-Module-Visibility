package com.example.food.service;

import com.elm.housing.facade.LiftingServiceFacade;

public class FoodService {

    public static void main(String[] args) {

        com.elm.housing.facade.LiftingServiceFacade liftingServiceFacade = new LiftingServiceFacade();

        System.out.println(liftingServiceFacade.createContract());
    }


    public String createFoodContract(){
        return "Food contract created";
    }
}

package com.elm.lifting.service;


import com.elm.housing.facade.LiftingServiceFacade;
import com.example.food.facade.FoodServiceFacade;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class LiftingService {

    public String createHouseLiftingContract(){

        LiftingServiceFacade housingLiftingService = new LiftingServiceFacade();

        return housingLiftingService.createContract();
    }

    public String createFoodContract(){
        com.example.food.facade.FoodServiceFacade foodServiceFacade = new FoodServiceFacade();
        return foodServiceFacade.createFoodContract();
    }


    public String createFoodContractReflection(){

        try {

            Class<?> cls = Class.forName("com.example.food.service.FoodService");
            Method method = cls.getMethod("createFoodContract");

            Object obj = cls.newInstance();

            // Invoke the method on the instance, passing in any necessary arguments
            String result = (String) method.invoke(obj);

            return result;

        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public String createFoodContractPrivate(){

        try {

            Class<?> cls = Class.forName("com.example.food.facade.FoodServiceFacade");
            Method method = cls.getMethod("createFoodContractPrivate");

            Object obj = cls.newInstance();

            // Invoke the method on the instance, passing in any necessary arguments
            String result = (String) method.invoke(obj);

            return result;

        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public String createFoodContractReflectionNotExported(){

        try {

            Class<?> cls = Class.forName("com.example.food.service.FoodService");
            Method method = cls.getMethod("createFoodContractNotPermitted");

            Object obj = cls.newInstance();

            // Invoke the method on the instance, passing in any necessary arguments
            String result = (String) method.invoke(obj);

            return result;

        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

}

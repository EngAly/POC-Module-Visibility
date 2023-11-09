package com.elm.lifting.controller;

import com.elm.lifting.service.LiftingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lifting")
public class LiftingServiceController {

    private final LiftingService liftingService;

    public LiftingServiceController(LiftingService liftingService) {
        this.liftingService = liftingService;
    }

    @GetMapping("ping")
    public String ping() {
        return "Health";
    }

    @GetMapping("create-house-contract")
    public String createHouseLiftingContract() {
        return liftingService.createHouseLiftingContract();
    }

    @GetMapping("create-food-contract")
    public String createFoodContract() {
        return liftingService.createFoodContract();
    }

    @GetMapping("create-food-reflection-contract")
    public String createFoodContractReflection() {
        return liftingService.createFoodContractReflection();
    }

    @GetMapping("create-food-reflection-private-contract")
    public String createFoodContractPrivate() {
        return liftingService.createFoodContractPrivate();
    }

    @GetMapping("create-food-reflection-not-permitted-contract")
    public String createFoodContractReflectionNotExported() {
        return liftingService.createFoodContractReflectionNotExported();
    }
}

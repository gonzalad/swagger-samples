package com.example.swagger.swaggerspringfox.vehicle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @GetMapping
    public List<Vehicle> findAll() {
        return new ArrayList<>();
    }
}

package com.example.Myhotel.Controller;


import com.example.Myhotel.Entity.User;
import com.example.Myhotel.Services.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@CrossOrigin("*")
public class HotelController {

    @Autowired
    private HotelService service;


    @PostMapping
    public User addHotel(@RequestBody User hotel) {

        return service.addHotel(hotel);

    }


    @GetMapping
    public List<User> getHotels() {

        return service.getHotels();

    }
}

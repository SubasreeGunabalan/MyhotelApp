package com.example.Myhotel.Services;

import com.example.Myhotel.Entity.User;
import com.example.Myhotel.Repository.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository repository;

    public User addHotel(User hotel) {

        return repository.save(hotel);

    }

    public List<User> getHotels() {

        return repository.findAll();

    }
}
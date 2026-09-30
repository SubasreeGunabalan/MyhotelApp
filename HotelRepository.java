package com.example.Myhotel.Repository;

import com.example.Myhotel.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<User, Long> {

}
package com.hppystay.hotelreservation.hotel.repository;

import com.hppystay.hotelreservation.hotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findAllByHotelId(Long hotelId);
}

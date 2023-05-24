package com.Restroom_Restroom.Repository;

// JPA implementation (This is known as DAO)

import com.Restroom_Restroom.Model.Restroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestroomRepository extends JpaRepository<Restroom, Integer> {
}

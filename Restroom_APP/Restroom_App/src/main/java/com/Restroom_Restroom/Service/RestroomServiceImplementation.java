package com.Restroom_Restroom.Service;

import com.Restroom_Restroom.Repository.RestroomRepository;
import com.Restroom_Restroom.Model.Restroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Business Logic
@Service
public class RestroomServiceImplementation implements RestroomService {

    @Autowired
    private RestroomRepository restroomRepository;
    @Override
    public Restroom saveRestroom(Restroom restroom) {

        return restroomRepository.save(restroom);
    }
}

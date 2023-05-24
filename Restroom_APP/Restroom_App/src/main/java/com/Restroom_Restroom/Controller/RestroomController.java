package com.Restroom_Restroom.Controller;


// Mappping http method - GET & POST ...
import com.Restroom_Restroom.Service.RestroomServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Restroom_Restroom.Service.RestroomService;
import com.Restroom_Restroom.Model.Restroom;
@RestController
@RequestMapping("/Restroom")
public class RestroomController {
    @Autowired
    private RestroomService restroomService;

    @PostMapping("/add")
    public String add(@RequestBody Restroom restroom){
        restroomService.saveRestroom(restroom);
        return "New Restroom is added";
    }
}

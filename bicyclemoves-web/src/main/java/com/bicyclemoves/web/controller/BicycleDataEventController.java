package com.bicyclemoves.web.controller;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.datafire.event.DataFireEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController(value = "/bdevent")
public class BicycleDataEventController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping(method = RequestMethod.POST)
    public void bicycleDockEvent(@RequestBody ArrayList<DataFireEvent<BicycleDock, BicyclesDataEventType>> bicycleDock){
        this.template.convertAndSend("/topic/message", bicycleDock);
    }

    @RequestMapping(method = RequestMethod.GET)
    public void bicycleDockEvent(){
        System.out.println("Get!");
    }
}

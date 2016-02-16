package com.bicyclemoves.web;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.bicyclemoves.web.model.BicycleStream;
import com.genericmethod.datafire.event.DataFireEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/bdevent")
public class BicycleMovesController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping(method = RequestMethod.POST)
    public void bicycleDockEvent(@RequestBody ArrayList<DataFireEvent<BicycleDock, BicyclesDataEventType>> bicycleDockEvents) throws InterruptedException {

        for (DataFireEvent<BicycleDock, BicyclesDataEventType> event : bicycleDockEvents) {
            BicycleStream bikeData = new BicycleStream(event.getMessage().getId(),
                    event.getMessage().getName(),
                    event.getMessage().getCyclesAvailable(),
                    event.getMessage().getCyclesTotal(),
                    event.getMessage().getCyclesBroken(),
                    event.getEventType());
            this.template.convertAndSend("/topic/message", bikeData);
        }
    }


}

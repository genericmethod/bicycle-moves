package com.bicyclemoves.web;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
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
    public void bicycleDockEvent(@RequestBody ArrayList<DataFireEvent<BicycleDock, BicyclesDataEventType>> bicycleDockEvents){
        for (DataFireEvent<BicycleDock, BicyclesDataEventType> event : bicycleDockEvents) {
            String message = event.getMessage().getName() + " - "+ event.getEventType().name() + " cycles available = " + event.getMessage().getCyclesAvailable();
            this.template.convertAndSend("/topic/message", message);
        }
    }


}

package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.feedfire.event.DataFireEventProducer;
import com.genericmethod.feedfire.event.Event;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BicycleDataEventProducer extends DataFireEventProducer<BicycleDock, BicyclesDataEventType>{

  @Override
  public void sendEvent(List<Event<BicycleDock, BicyclesDataEventType>> events) {
    for (Event<BicycleDock, BicyclesDataEventType> event : events) {
      System.out.println(event.getMessage().getName() + " - "+ event.getEventType().name() + " cycles available = " + event.getMessage().getCyclesAvailable());
    }
  }
}

package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.datafire.event.DataFireEvent;
import com.genericmethod.datafire.event.DataFireEventProducer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BicycleDataEventProducer extends DataFireEventProducer<BicycleDock, BicyclesDataEventType>{

  @Override
  public void sendEvent(List<DataFireEvent<BicycleDock, BicyclesDataEventType>> events) {
    for (DataFireEvent<BicycleDock, BicyclesDataEventType> event : events) {
      System.out.println(event.getMessage().getName() + " - "+ event.getEventType().name() + " cycles available = " + event.getMessage().getCyclesAvailable());
    }
  }
}

package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.datafire.event.DataFireEvent;
import com.genericmethod.datafire.event.DataFireEventProducer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BicycleDataEventProducer extends DataFireEventProducer<BicycleDock, BicyclesDataEventType>{

  private static final Logger log = Logger.getLogger(BicycleDataEventProducer.class);

  @Override
  public void sendEvent(List<DataFireEvent<BicycleDock, BicyclesDataEventType>> events) {
    for (DataFireEvent<BicycleDock, BicyclesDataEventType> event : events) {
      System.out.println(event.getMessage().getName() + " - "+ event.getEventType().name() + " cycles available = " + event.getMessage().getCyclesAvailable());
    }

    RestTemplate restTemplate = new RestTemplate();
    final String response = restTemplate.postForObject("http://localhost:8080/bdevent", events, String.class);
  }
}

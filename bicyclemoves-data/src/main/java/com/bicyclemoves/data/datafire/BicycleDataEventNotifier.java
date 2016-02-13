package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.feedfire.cache.CacheService;
import com.genericmethod.feedfire.event.DataFireEventNotifier;
import com.genericmethod.feedfire.event.DataFireEventProducer;
import com.genericmethod.feedfire.event.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BicycleDataEventNotifier extends DataFireEventNotifier<BicycleDock,BicyclesDataEventType>{

  @Autowired public BicycleDataCacheService bicycleDataCacheService;
  @Autowired public BicycleDataEventProducer bicycleDataEventProducer;


  @Override
  public CacheService getCacheService() {
    return bicycleDataCacheService;
  }

  @Override
  public DataFireEventProducer getEventProducer() {
    return bicycleDataEventProducer;
  }

  @Override
  public List<Event<BicycleDock, BicyclesDataEventType>> getEvent(BicycleDock cachedObj,
                                                                  BicycleDock feedObject) {

    List<Event<BicycleDock, BicyclesDataEventType>> events = new ArrayList<Event<BicycleDock, BicyclesDataEventType>>();

    if (cachedObj == null && feedObject != null){
      events.add(new Event<BicycleDock, BicyclesDataEventType>(feedObject,BicyclesDataEventType.BICYCLE_DOCK_ADDED));
      return events;
    }

    if (cachedObj != null && feedObject != null) {

      if (!cachedObj.getCyclesAvailable().equals(feedObject.getCyclesAvailable())){
        events.add(new Event<BicycleDock, BicyclesDataEventType>(feedObject,BicyclesDataEventType.BICYCLE_AVAILABLITY_CHANGED));
      }

      if (!cachedObj.getCyclesBroken().equals(feedObject.getCyclesBroken())){
        events.add(new Event<BicycleDock, BicyclesDataEventType>(feedObject,BicyclesDataEventType.BICYCLE_BROKEN_CHANGED));
      }
    }

    return events;
  }
}

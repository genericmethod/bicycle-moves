package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.enums.BicyclesDataEventType;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.datafire.cache.CacheService;
import com.genericmethod.datafire.event.DataFireEventNotifier;
import com.genericmethod.datafire.event.DataFireEventProducer;
import com.genericmethod.datafire.event.DataFireEvent;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BicycleDataEventNotifier extends DataFireEventNotifier<BicycleDock,BicyclesDataEventType>{

  private static final Logger log = Logger.getLogger(BicycleDataEventNotifier.class);

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
  public List<DataFireEvent<BicycleDock, BicyclesDataEventType>> getEvent(BicycleDock cachedObj,
                                                                  BicycleDock feedObject) {

    List<DataFireEvent<BicycleDock, BicyclesDataEventType>> events = new ArrayList<DataFireEvent<BicycleDock, BicyclesDataEventType>>();

    if (cachedObj == null && feedObject != null){
      events.add(new DataFireEvent<BicycleDock, BicyclesDataEventType>(feedObject,BicyclesDataEventType.BICYCLE_DOCK_ADDED));
      return events;
    }

    if (cachedObj != null && feedObject != null) {

      if (cachedObj.getCyclesAvailable() != feedObject.getCyclesAvailable()){
        log.info(cachedObj.getName() + " BICYCLE_AVAILABLITY_CHANGED " + cachedObj.getCyclesAvailable() + " >> " + feedObject.getCyclesAvailable());
        events.add(new DataFireEvent<BicycleDock, BicyclesDataEventType>(feedObject, BicyclesDataEventType.BICYCLE_AVAILABLITY_CHANGED));
      }

      if (cachedObj.getCyclesBroken() != feedObject.getCyclesBroken()){
        events.add(new DataFireEvent<BicycleDock, BicyclesDataEventType>(feedObject, BicyclesDataEventType.BICYCLE_BROKEN_CHANGED));
      }
    }

    return events;
  }
}

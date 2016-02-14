package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.datafire.cache.CacheService;
import com.genericmethod.datafire.event.DataFireEventNotifier;
import com.genericmethod.datafire.mapper.DataFireMapper;
import com.genericmethod.datafire.request.DataFireRequestScheduler;
import com.genericmethod.datafire.request.DataFireRequester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BicycleDataRequestScheduler extends DataFireRequestScheduler<BicycleDock> {

  @Autowired public BicycleDataRequester bicycleDataRequester;
  @Autowired public BicycleDataMapper bicycleDataMapper;
  @Autowired public BicycleDataCacheService bicycleDataCacheService;
  @Autowired public BicycleDataEventNotifier bicycleDataEventNotifier;

  @Override
  public DataFireRequester getRequester() {
    return bicycleDataRequester;
  }

  @Override
  public DataFireMapper getMapper() {
    return bicycleDataMapper;
  }

  @Override
  public CacheService getCacheService() {
    return bicycleDataCacheService;
  }

  @Override
  public DataFireEventNotifier getNotifier() {
    return bicycleDataEventNotifier;
  }

  @Override
  public long getFixedDelay() {
    return 10000;
  }
}

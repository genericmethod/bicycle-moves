package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.feedfire.cache.DataFireInMemoryCacheService;

import org.springframework.stereotype.Component;

@Component
public class BicycleDataCacheService extends DataFireInMemoryCacheService<BicycleDock> {
}

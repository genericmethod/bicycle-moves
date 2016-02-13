package com.bicyclemoves.data.datafire;


import com.google.gson.Gson;

import com.bicyclemoves.data.model.BicycleData;
import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.feedfire.exception.FeedFireException;
import com.genericmethod.feedfire.mapper.DataFireMapper;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BicycleDataMapper extends DataFireMapper<BicycleDock> {

  private Gson gson = new Gson();

  @Override
  public List<BicycleDock> mapToModel(String s) throws FeedFireException {
    final BicycleData bicycleData = gson.fromJson(s, BicycleData.class);
    return bicycleData.getElements();
  }
}

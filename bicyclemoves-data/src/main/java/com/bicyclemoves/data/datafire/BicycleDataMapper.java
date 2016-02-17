package com.bicyclemoves.data.datafire;


import com.bicyclemoves.data.model.BicycleData;
import com.bicyclemoves.data.model.BicycleDock;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genericmethod.datafire.exception.DataFireException;
import com.genericmethod.datafire.mapper.DataFireMapper;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class BicycleDataMapper extends DataFireMapper<BicycleDock> {

  private Gson gson = new Gson();

  @Override
  public List<BicycleDock> mapToModel(String s) throws DataFireException {

    ObjectMapper mapper = new ObjectMapper();
    BicycleData bicycleData;
    try {
      bicycleData = mapper.readValue(s, BicycleData.class);
    } catch (IOException e) {
      throw new DataFireException("Could not map data");
    }
    return bicycleData.getElements();
  }
}

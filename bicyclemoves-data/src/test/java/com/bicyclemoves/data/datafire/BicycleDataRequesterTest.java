package com.bicyclemoves.data.datafire;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BicycleDataRequesterTest {

  @Test
  public void testDataRequester(){
    BicycleDataRequester requester = new BicycleDataRequester();
    assertNotNull(requester.getFeedUrl());
  }

}
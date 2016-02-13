package com.bicyclemoves.data.datafire;

import com.genericmethod.feedfire.request.DataFireOkHttpRequester;
import com.squareup.okhttp.HttpUrl;

import org.springframework.stereotype.Component;

@Component
public class BicycleDataRequester extends DataFireOkHttpRequester {

  @Override
  public HttpUrl getFeedUrl() {

    return new HttpUrl.Builder()
            .scheme("https")
            .host("www4.citymapper.com")
            .addPathSegment("api")
            .addPathSegment("3")
            .addPathSegment("nearby")
            .addQueryParameter("location", "51.50464718920731,-0.011419123251457108")
            .addQueryParameter("kinds", "cycledock")
            .addQueryParameter("region_id", "uk-london")
            .build();
  }
}


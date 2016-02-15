package com.bicyclemoves.data.datafire;

import com.genericmethod.datafire.request.DataFireOkHttpRequester;
import com.squareup.okhttp.HttpUrl;

import org.springframework.stereotype.Component;

@Component
public class BicycleDataRequester extends DataFireOkHttpRequester {

  @Override
  public HttpUrl getDataEndpointUrl() {

    return new HttpUrl.Builder()
            .scheme("https")
            .host("www4.citymapper.com")
            .addPathSegment("api")
            .addPathSegment("3")
            .addPathSegment("nearby")
            .addQueryParameter("location", "51.51515019423544,-0.10143098244529414")
            .addQueryParameter("kinds", "cycledock")
            .addQueryParameter("region_id", "uk-london")
            .build();
  }
}


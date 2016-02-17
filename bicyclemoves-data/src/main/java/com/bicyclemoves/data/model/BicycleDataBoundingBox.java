
package com.bicyclemoves.data.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "northeast_corner_coords",
    "southwest_corner_coords"
})
public class BicycleDataBoundingBox {

    @JsonProperty("northeast_corner_coords")
    private List<Double> northeastCornerCoords = new ArrayList<Double>();
    @JsonProperty("southwest_corner_coords")
    private List<Double> southwestCornerCoords = new ArrayList<Double>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BicycleDataBoundingBox() {
    }

    /**
     * 
     * @param northeastCornerCoords
     * @param southwestCornerCoords
     */
    public BicycleDataBoundingBox(List<Double> northeastCornerCoords, List<Double> southwestCornerCoords) {
        this.northeastCornerCoords = northeastCornerCoords;
        this.southwestCornerCoords = southwestCornerCoords;
    }

    /**
     * 
     * @return
     *     The northeastCornerCoords
     */
    @JsonProperty("northeast_corner_coords")
    public List<Double> getNortheastCornerCoords() {
        return northeastCornerCoords;
    }

    /**
     * 
     * @param northeastCornerCoords
     *     The northeast_corner_coords
     */
    @JsonProperty("northeast_corner_coords")
    public void setNortheastCornerCoords(List<Double> northeastCornerCoords) {
        this.northeastCornerCoords = northeastCornerCoords;
    }

    /**
     * 
     * @return
     *     The southwestCornerCoords
     */
    @JsonProperty("southwest_corner_coords")
    public List<Double> getSouthwestCornerCoords() {
        return southwestCornerCoords;
    }

    /**
     * 
     * @param southwestCornerCoords
     *     The southwest_corner_coords
     */
    @JsonProperty("southwest_corner_coords")
    public void setSouthwestCornerCoords(List<Double> southwestCornerCoords) {
        this.southwestCornerCoords = southwestCornerCoords;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

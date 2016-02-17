
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
    "bounding_box",
    "elements",
    "last_updated_time"
})
public class BicycleData {

    @JsonProperty("bounding_box")
    private BicycleDataBoundingBox boundingBox;
    @JsonProperty("elements")
    private List<BicycleDock> elements = new ArrayList<BicycleDock>();
    @JsonProperty("last_updated_time")
    private String lastUpdatedTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BicycleData() {
    }

    /**
     * 
     * @param boundingBox
     * @param lastUpdatedTime
     * @param elements
     */
    public BicycleData(BicycleDataBoundingBox boundingBox, List<BicycleDock> elements, String lastUpdatedTime) {
        this.boundingBox = boundingBox;
        this.elements = elements;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * 
     * @return
     *     The boundingBox
     */
    @JsonProperty("bounding_box")
    public BicycleDataBoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * 
     * @param boundingBox
     *     The bounding_box
     */
    @JsonProperty("bounding_box")
    public void setBoundingBox(BicycleDataBoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * 
     * @return
     *     The elements
     */
    @JsonProperty("elements")
    public List<BicycleDock> getElements() {
        return elements;
    }

    /**
     * 
     * @param elements
     *     The elements
     */
    @JsonProperty("elements")
    public void setElements(List<BicycleDock> elements) {
        this.elements = elements;
    }

    /**
     * 
     * @return
     *     The lastUpdatedTime
     */
    @JsonProperty("last_updated_time")
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * 
     * @param lastUpdatedTime
     *     The last_updated_time
     */
    @JsonProperty("last_updated_time")
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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

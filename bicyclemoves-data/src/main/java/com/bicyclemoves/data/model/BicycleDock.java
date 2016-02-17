
package com.bicyclemoves.data.model;

import com.fasterxml.jackson.annotation.*;
import com.genericmethod.datafire.cache.CacheableObject;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cycles_available",
    "cycles_broken",
    "name",
    "kind",
    "cycles_spaces",
    "brand_id",
    "coords",
    "walk_time_seconds",
    "cycles_total",
    "id"
})
public class BicycleDock extends CacheableObject{

    @JsonProperty("cycles_available")
    private Integer cyclesAvailable;
    @JsonProperty("cycles_broken")
    private Integer cyclesBroken;
    @JsonProperty("name")
    private String name;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("cycles_spaces")
    private Integer cyclesSpaces;
    @JsonProperty("brand_id")
    private String brandId;
    @JsonProperty("coords")
    private List<Double> coords = new ArrayList<Double>();
    @JsonProperty("walk_time_seconds")
    private Integer walkTimeSeconds;
    @JsonProperty("cycles_total")
    private Integer cyclesTotal;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BicycleDock() {
    }

    @Override
    public String getCacheId() {
        return getId();
    }

    /**
     * 
     * @param id
     * @param cyclesSpaces
     * @param coords
     * @param cyclesBroken
     * @param name
     * @param brandId
     * @param cyclesTotal
     * @param walkTimeSeconds
     * @param kind
     * @param cyclesAvailable
     */
    public BicycleDock(Integer cyclesAvailable, Integer cyclesBroken, String name, String kind, Integer cyclesSpaces, String brandId, List<Double> coords, Integer walkTimeSeconds, Integer cyclesTotal, String id) {
        this.cyclesAvailable = cyclesAvailable;
        this.cyclesBroken = cyclesBroken;
        this.name = name;
        this.kind = kind;
        this.cyclesSpaces = cyclesSpaces;
        this.brandId = brandId;
        this.coords = coords;
        this.walkTimeSeconds = walkTimeSeconds;
        this.cyclesTotal = cyclesTotal;
        this.id = id;
    }

    /**
     * 
     * @return
     *     The cyclesAvailable
     */
    @JsonProperty("cycles_available")
    public Integer getCyclesAvailable() {
        return cyclesAvailable;
    }

    /**
     * 
     * @param cyclesAvailable
     *     The cycles_available
     */
    @JsonProperty("cycles_available")
    public void setCyclesAvailable(Integer cyclesAvailable) {
        this.cyclesAvailable = cyclesAvailable;
    }

    /**
     * 
     * @return
     *     The cyclesBroken
     */
    @JsonProperty("cycles_broken")
    public Integer getCyclesBroken() {
        return cyclesBroken;
    }

    /**
     * 
     * @param cyclesBroken
     *     The cycles_broken
     */
    @JsonProperty("cycles_broken")
    public void setCyclesBroken(Integer cyclesBroken) {
        this.cyclesBroken = cyclesBroken;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The cyclesSpaces
     */
    @JsonProperty("cycles_spaces")
    public Integer getCyclesSpaces() {
        return cyclesSpaces;
    }

    /**
     * 
     * @param cyclesSpaces
     *     The cycles_spaces
     */
    @JsonProperty("cycles_spaces")
    public void setCyclesSpaces(Integer cyclesSpaces) {
        this.cyclesSpaces = cyclesSpaces;
    }

    /**
     * 
     * @return
     *     The brandId
     */
    @JsonProperty("brand_id")
    public String getBrandId() {
        return brandId;
    }

    /**
     * 
     * @param brandId
     *     The brand_id
     */
    @JsonProperty("brand_id")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     * @return
     *     The coords
     */
    @JsonProperty("coords")
    public List<Double> getCoords() {
        return coords;
    }

    /**
     * 
     * @param coords
     *     The coords
     */
    @JsonProperty("coords")
    public void setCoords(List<Double> coords) {
        this.coords = coords;
    }

    /**
     * 
     * @return
     *     The walkTimeSeconds
     */
    @JsonProperty("walk_time_seconds")
    public Integer getWalkTimeSeconds() {
        return walkTimeSeconds;
    }

    /**
     * 
     * @param walkTimeSeconds
     *     The walk_time_seconds
     */
    @JsonProperty("walk_time_seconds")
    public void setWalkTimeSeconds(Integer walkTimeSeconds) {
        this.walkTimeSeconds = walkTimeSeconds;
    }

    /**
     * 
     * @return
     *     The cyclesTotal
     */
    @JsonProperty("cycles_total")
    public Integer getCyclesTotal() {
        return cyclesTotal;
    }

    /**
     * 
     * @param cyclesTotal
     *     The cycles_total
     */
    @JsonProperty("cycles_total")
    public void setCyclesTotal(Integer cyclesTotal) {
        this.cyclesTotal = cyclesTotal;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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

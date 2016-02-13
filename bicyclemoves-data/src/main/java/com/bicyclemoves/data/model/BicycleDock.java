
package com.bicyclemoves.data.model;

import com.genericmethod.feedfire.cache.CacheableObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class BicycleDock extends CacheableObject{

    @SerializedName("cycles_available")
    @Expose
    private Integer cyclesAvailable;
    @SerializedName("cycles_broken")
    @Expose
    private Integer cyclesBroken;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("cycles_spaces")
    @Expose
    private Integer cyclesSpaces;
    @SerializedName("brand_id")
    @Expose
    private String brandId;
    @SerializedName("coords")
    @Expose
    private List<Double> coords = new ArrayList<Double>();
    @SerializedName("walk_time_seconds")
    @Expose
    private Integer walkTimeSeconds;
    @SerializedName("cycles_total")
    @Expose
    private Integer cyclesTotal;
    @SerializedName("id")
    @Expose
    private String id;

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
    public Integer getCyclesAvailable() {
        return cyclesAvailable;
    }

    /**
     * 
     * @param cyclesAvailable
     *     The cycles_available
     */
    public void setCyclesAvailable(Integer cyclesAvailable) {
        this.cyclesAvailable = cyclesAvailable;
    }

    /**
     * 
     * @return
     *     The cyclesBroken
     */
    public Integer getCyclesBroken() {
        return cyclesBroken;
    }

    /**
     * 
     * @param cyclesBroken
     *     The cycles_broken
     */
    public void setCyclesBroken(Integer cyclesBroken) {
        this.cyclesBroken = cyclesBroken;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The cyclesSpaces
     */
    public Integer getCyclesSpaces() {
        return cyclesSpaces;
    }

    /**
     * 
     * @param cyclesSpaces
     *     The cycles_spaces
     */
    public void setCyclesSpaces(Integer cyclesSpaces) {
        this.cyclesSpaces = cyclesSpaces;
    }

    /**
     * 
     * @return
     *     The brandId
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * 
     * @param brandId
     *     The brand_id
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     * @return
     *     The coords
     */
    public List<Double> getCoords() {
        return coords;
    }

    /**
     * 
     * @param coords
     *     The coords
     */
    public void setCoords(List<Double> coords) {
        this.coords = coords;
    }

    /**
     * 
     * @return
     *     The walkTimeSeconds
     */
    public Integer getWalkTimeSeconds() {
        return walkTimeSeconds;
    }

    /**
     * 
     * @param walkTimeSeconds
     *     The walk_time_seconds
     */
    public void setWalkTimeSeconds(Integer walkTimeSeconds) {
        this.walkTimeSeconds = walkTimeSeconds;
    }

    /**
     * 
     * @return
     *     The cyclesTotal
     */
    public Integer getCyclesTotal() {
        return cyclesTotal;
    }

    /**
     * 
     * @param cyclesTotal
     *     The cycles_total
     */
    public void setCyclesTotal(Integer cyclesTotal) {
        this.cyclesTotal = cyclesTotal;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cyclesAvailable).append(cyclesBroken).append(name).append(kind).append(cyclesSpaces).append(brandId).append(coords).append(walkTimeSeconds).append(cyclesTotal).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BicycleDock) == false) {
            return false;
        }
        BicycleDock rhs = ((BicycleDock) other);
        return new EqualsBuilder().append(cyclesAvailable, rhs.cyclesAvailable).append(cyclesBroken, rhs.cyclesBroken).append(name, rhs.name).append(kind, rhs.kind).append(cyclesSpaces, rhs.cyclesSpaces).append(brandId, rhs.brandId).append(coords, rhs.coords).append(walkTimeSeconds, rhs.walkTimeSeconds).append(cyclesTotal, rhs.cyclesTotal).append(id, rhs.id).isEquals();
    }

}

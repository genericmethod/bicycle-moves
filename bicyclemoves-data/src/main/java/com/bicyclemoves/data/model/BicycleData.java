
package com.bicyclemoves.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class BicycleData {

    @SerializedName("bounding_box")
    @Expose
    private BicycleDataBoundingBox boundingBox;
    @SerializedName("elements")
    @Expose
    private List<BicycleDock> elements = new ArrayList<BicycleDock>();
    @SerializedName("last_updated_time")
    @Expose
    private String lastUpdatedTime;

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
    public BicycleDataBoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * 
     * @param boundingBox
     *     The bounding_box
     */
    public void setBoundingBox(BicycleDataBoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * 
     * @return
     *     The elements
     */
    public List<BicycleDock> getElements() {
        return elements;
    }

    /**
     * 
     * @param elements
     *     The elements
     */
    public void setElements(List<BicycleDock> elements) {
        this.elements = elements;
    }

    /**
     * 
     * @return
     *     The lastUpdatedTime
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * 
     * @param lastUpdatedTime
     *     The last_updated_time
     */
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(boundingBox).append(elements).append(lastUpdatedTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BicycleData) == false) {
            return false;
        }
        BicycleData rhs = ((BicycleData) other);
        return new EqualsBuilder().append(boundingBox, rhs.boundingBox).append(elements, rhs.elements).append(lastUpdatedTime, rhs.lastUpdatedTime).isEquals();
    }

}

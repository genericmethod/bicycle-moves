
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
public class BicycleDataBoundingBox {

    @SerializedName("northeast_corner_coords")
    @Expose
    private List<Double> northeastCornerCoords = new ArrayList<Double>();
    @SerializedName("southwest_corner_coords")
    @Expose
    private List<Double> southwestCornerCoords = new ArrayList<Double>();

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
    public List<Double> getNortheastCornerCoords() {
        return northeastCornerCoords;
    }

    /**
     * 
     * @param northeastCornerCoords
     *     The northeast_corner_coords
     */
    public void setNortheastCornerCoords(List<Double> northeastCornerCoords) {
        this.northeastCornerCoords = northeastCornerCoords;
    }

    /**
     * 
     * @return
     *     The southwestCornerCoords
     */
    public List<Double> getSouthwestCornerCoords() {
        return southwestCornerCoords;
    }

    /**
     * 
     * @param southwestCornerCoords
     *     The southwest_corner_coords
     */
    public void setSouthwestCornerCoords(List<Double> southwestCornerCoords) {
        this.southwestCornerCoords = southwestCornerCoords;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(northeastCornerCoords).append(southwestCornerCoords).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BicycleDataBoundingBox) == false) {
            return false;
        }
        BicycleDataBoundingBox rhs = ((BicycleDataBoundingBox) other);
        return new EqualsBuilder().append(northeastCornerCoords, rhs.northeastCornerCoords).append(southwestCornerCoords, rhs.southwestCornerCoords).isEquals();
    }

}

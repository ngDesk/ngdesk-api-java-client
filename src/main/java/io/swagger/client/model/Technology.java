/*
 * ngDesk_Operations
 * ngDesk_Operations
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Technology
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T16:44:12.820Z")
public class Technology {
  @SerializedName("TechnologyId")
  private Integer technologyId = null;

  @SerializedName("TechnologyName")
  private String technologyName = null;

  public Technology technologyId(Integer technologyId) {
    this.technologyId = technologyId;
    return this;
  }

   /**
   * Get technologyId
   * @return technologyId
  **/
  @ApiModelProperty(value = "")
  public Integer getTechnologyId() {
    return technologyId;
  }

  public void setTechnologyId(Integer technologyId) {
    this.technologyId = technologyId;
  }

  public Technology technologyName(String technologyName) {
    this.technologyName = technologyName;
    return this;
  }

   /**
   * Get technologyName
   * @return technologyName
  **/
  @ApiModelProperty(value = "")
  public String getTechnologyName() {
    return technologyName;
  }

  public void setTechnologyName(String technologyName) {
    this.technologyName = technologyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Technology technology = (Technology) o;
    return Objects.equals(this.technologyId, technology.technologyId) &&
        Objects.equals(this.technologyName, technology.technologyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technologyId, technologyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Technology {\n");
    
    sb.append("    technologyId: ").append(toIndentedString(technologyId)).append("\n");
    sb.append("    technologyName: ").append(toIndentedString(technologyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


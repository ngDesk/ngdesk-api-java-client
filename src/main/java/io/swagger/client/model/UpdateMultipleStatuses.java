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
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateMultipleStatuses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T16:44:12.820Z")
public class UpdateMultipleStatuses {
  @SerializedName("Status")
  private String status = null;

  @SerializedName("TicketUUID")
  private List<String> ticketUUID = null;

  public UpdateMultipleStatuses status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UpdateMultipleStatuses ticketUUID(List<String> ticketUUID) {
    this.ticketUUID = ticketUUID;
    return this;
  }

  public UpdateMultipleStatuses addTicketUUIDItem(String ticketUUIDItem) {
    if (this.ticketUUID == null) {
      this.ticketUUID = new ArrayList<String>();
    }
    this.ticketUUID.add(ticketUUIDItem);
    return this;
  }

   /**
   * Get ticketUUID
   * @return ticketUUID
  **/
  @ApiModelProperty(value = "")
  public List<String> getTicketUUID() {
    return ticketUUID;
  }

  public void setTicketUUID(List<String> ticketUUID) {
    this.ticketUUID = ticketUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMultipleStatuses updateMultipleStatuses = (UpdateMultipleStatuses) o;
    return Objects.equals(this.status, updateMultipleStatuses.status) &&
        Objects.equals(this.ticketUUID, updateMultipleStatuses.ticketUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, ticketUUID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMultipleStatuses {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ticketUUID: ").append(toIndentedString(ticketUUID)).append("\n");
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


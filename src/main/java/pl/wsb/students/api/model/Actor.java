/*
 * Java Course Movie App API
 * Sample Movie App AI
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pl.wsb.students.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Actor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-30T07:31:54.867Z")
public class Actor   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("ratings")
  private List<ActorRatings> ratings = null;

  public Actor id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Actor id
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(required = true, value = "Actor id")
  @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Actor firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Actor first name
   * @return firstName
   **/
  @JsonProperty("first_name")
  @ApiModelProperty(required = true, value = "Actor first name")
  @NotNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Actor lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Actor last name
   * @return lastName
   **/
  @JsonProperty("last_name")
  @ApiModelProperty(required = true, value = "Actor last name")
  @NotNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Actor ratings(List<ActorRatings> ratings) {
    this.ratings = ratings;
    return this;
  }

  public Actor addRatingsItem(ActorRatings ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<ActorRatings>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * Get ratings
   * @return ratings
   **/
  @JsonProperty("ratings")
  @ApiModelProperty(value = "")
  public List<ActorRatings> getRatings() {
    return ratings;
  }

  public void setRatings(List<ActorRatings> ratings) {
    this.ratings = ratings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actor actor = (Actor) o;
    return Objects.equals(this.id, actor.id) &&
        Objects.equals(this.firstName, actor.firstName) &&
        Objects.equals(this.lastName, actor.lastName) &&
        Objects.equals(this.ratings, actor.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, ratings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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


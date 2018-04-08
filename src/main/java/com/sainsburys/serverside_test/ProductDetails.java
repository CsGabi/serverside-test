package com.sainsburys.serverside_test;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class ProductDetails {
  private String _title;
  private double _size;
  private double _unitPrice;
  private String _description;

  public String getTitle() {
    return _title;
  }

  public void setTitle(String title) {
    _title = title;
  }

  public double getSize() {
    return _size;
  }

  public void setSize(double size) {
    _size = size;
  }

  public double getUnitPrice() {
    return _unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    _unitPrice = unitPrice;
  }

  public String getDescription() {
    return _description;
  }

  public void setDescription(String description) {
    _description = description;
  }

  public ProductDetails(String title, double size, double unitPrice, String description){
    _title = title;
    _size = size;
    _unitPrice = unitPrice;
    _description = description;
  }

  public JsonObject buildJJON(){
    JsonBuilderFactory factory = Json.createBuilderFactory(null);
    JsonObject value = factory.createObjectBuilder()
        .add("title", _title)
        .add("size", _size)
        .add("unitPrice", _unitPrice)
        .add("description", _description)
        .build();

    return value;
  }


}

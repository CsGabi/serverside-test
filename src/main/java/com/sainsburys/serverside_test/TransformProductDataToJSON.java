package com.sainsburys.serverside_test;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 * This class transform a ProductDetails object to a JSON data.
 */
public class TransformProductDataToJSON {

  public static JsonObject transform(ProductDetails productDetails){
      JsonBuilderFactory factory = Json.createBuilderFactory(null);
      JsonObjectBuilder json = factory.createObjectBuilder();
      json.add("title", productDetails.getTitle());
      json.add("unit_price", productDetails.getUnitPrice());
      Double kcal_per_100g = productDetails.getKcalPer100g();
      if(kcal_per_100g != null){
        json.add("kcal_per_100g", kcal_per_100g);
      }
      json.add("description", productDetails.getDescription());
      return json.build();
  }

}

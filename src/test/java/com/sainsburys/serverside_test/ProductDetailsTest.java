package com.sainsburys.serverside_test;

import org.junit.Assert;
import org.junit.Test;

import javax.json.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for Product details transform to JSON.
 */
public class ProductDetailsTest{

  @Test
  public void productDetailsTransformJSON(){
    ProductDetails productDetails = new ProductDetails("Paprika", 6.21, new Double("621"), "Most famous Hungarian" +
        " paprika.");
    
    JsonBuilderFactory factory = Json.createBuilderFactory(null);
    JsonObjectBuilder jResult = factory.createObjectBuilder();
    jResult.add("title", "Paprika");
    jResult.add("unit_price", 6.21);
    jResult.add("kcal_per_100g", 621.0);
    jResult.add("description", "Most famous Hungarian paprika.");

    Assert.assertEquals(jResult.build(), TransformProductDataToJSON.transform(productDetails));
  }
}

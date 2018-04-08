package com.sainsburys.serverside_test;

import javax.json.*;
import java.util.Collection;

/**
 * This class responsible for building a  result JSON from a Collection of ProductDetails.
 */
public class BuildJSONResult {

  public static JsonObject buildJSONResult(Collection<ProductDetails> productDetails){
    double totalPrice = 0;

    JsonBuilderFactory factory = Json.createBuilderFactory(null);
    JsonObjectBuilder json = factory.createObjectBuilder();
    JsonArrayBuilder dataStoresJson = factory.createArrayBuilder();

    for(ProductDetails productDetail : productDetails){
      dataStoresJson.add(TransformProductDataToJSON.transform(productDetail));
      totalPrice += productDetail.getUnitPrice();
    }

    json.add("result", dataStoresJson);
    json.add("tolal", totalPrice);

    return json.build();
  }

}

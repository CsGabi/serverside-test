package com.sainsburys.serverside_test;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * This class responsible the HTTP connection and looks for data with selectors.
 */
public class HTTPFetcher {
  private URL _url;

  public HTTPFetcher(URL url){
    _url = url;
  }

  /**
   * This method collect data from added HTML page.
   *
   * @return Collection of ProductDetails
   */
  public Collection<ProductDetails> fetchingData(){

    Connection connection = Jsoup.connect(_url.toString());

    Collection<ProductDetails> productDetails = new ArrayList<>();

    try {
      Document document = connection.get();
      Elements elements = document.select("#productLister .gridItem");

      for (Element element: elements){
        String title = element.select("h3 a").text();

        Double unit_price = new Double(element.select(".pricePerUnit").text().split("/")[0].substring(1));
        unit_price = Math.round(unit_price * 100.0) / 100.0;

        StringBuilder descriptionURL = new StringBuilder();
        descriptionURL.append("https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop");
        descriptionURL.append(element.select("h3 a").attr("href").split("shop")[1]);

        Document decritpionDoc = Jsoup.connect(descriptionURL.toString()).get();
        Double kcal_per_100g = null;
        Elements fullDetailsList = decritpionDoc.select(".nutritionLevel1");
        if(!fullDetailsList.isEmpty()){
          String kcal_per_100gWithKcal = fullDetailsList.first().text();
          kcal_per_100g = new Double(kcal_per_100gWithKcal.split("kcal")[0]);
        }

        String description = decritpionDoc.select("div.productText p").first().text();

        productDetails.add(new ProductDetails(title, unit_price, kcal_per_100g, description));

      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return productDetails;
  }

}

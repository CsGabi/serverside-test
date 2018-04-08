package com.sainsburys.serverside_test;

import java.io.IOException;
import java.net.URL;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.json.JsonObject;

public class HTTPFetcher {
  private Connection _connection;
  private URL _url;

  public URL getUrl() {
    return _url;
  }

  public void setUrl(URL url) {
    _url = url;
  }

  public HTTPFetcher(URL url){
    _url = url;
  }

  public JsonObject fetchingData(){

    _connection = Jsoup.connect(_url.toString());

    try {
      Document document = _connection.get();
      Elements elements = document.select("#productLister .gridItem");

      for (Element element: elements){
        String productName = element.select("h3 a").text();
        String pricePerUnit = element.select(".pricePerUnit").text();
        String pricePerMeasure = element.select("pricePerMeasure").text();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

}

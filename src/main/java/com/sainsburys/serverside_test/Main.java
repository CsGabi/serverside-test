package com.sainsburys.serverside_test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Main class, look for sainsbury's groceries data and parse it to a JSON standard output like a string.
 *
 */
public class Main {
  private static String url = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/webapp/wcs/stores/servlet/gb/groceries/berries-cherries-currants6039.html";

  public static void main( String[] args ){
    try {
      HTTPFetcher httpFetcher = new HTTPFetcher(new URL(url));
      System.out.println(BuildJSONResult.buildJSONResult(httpFetcher.fetchingData()));
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }
}

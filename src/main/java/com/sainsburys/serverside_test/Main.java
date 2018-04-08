package com.sainsburys.serverside_test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Main class
 *
 */
public class Main {
  private static String url = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/webapp/wcs/stores/servlet/gb/groceries/berries-cherries-currants6039.html";

  public static void main( String[] args ){
    try {
      HTTPFetcher httpFetcher = new HTTPFetcher(new URL(url));
      httpFetcher.fetchingData();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }
}

package com.sainsburys.serverside_test;

import java.net.URL;
import org.jsoup.*;

public class HTTPFetcher {
  private Connection _connection;

  public URL getUrl() {
    return _url;
  }

  public void setUrl(URL _url) {
    _url = _url;
  }

  private URL _url;

  public HTTPFetcher(URL url){
    _url = url;
  }


}

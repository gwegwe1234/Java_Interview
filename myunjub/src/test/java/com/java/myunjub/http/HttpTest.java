package com.java.myunjub.http;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

public class HttpTest {

  @Test
  public void makeBareHttoRequest() throws IOException {
    final URL url = new URL("http", "en.wikipedia.org", "/");
    final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    final InputStream responseInputStream = connection.getInputStream();

    final int responseCode = connection.getResponseCode();
    final String response = IOUtils.toString(responseInputStream);

    responseInputStream.close();

    assertEquals(301, responseCode);
    System.out.printf("Response received: [%s]%n", response);
  }

  @Test
  public void makeApacheHttpClientRequest() throws IOException {
    final CloseableHttpClient client = HttpClients.createDefault();
    HttpGet get = new HttpGet("http://en.wikipedia.org/");
    final HttpResponse response = client.execute(get);
    final int responseCode = response.getStatusLine().getStatusCode();
    final HttpEntity entity = response.getEntity();
    final InputStream responseBody = entity.getContent();

    assertEquals(200, responseCode);
  }
}

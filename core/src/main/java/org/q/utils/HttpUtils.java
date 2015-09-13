package org.q.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.*;

public class HttpUtils {

	public static String httpPost(String url, Map<String, String> param,
			Map<String, String> headers) throws ClientProtocolException,
			IOException {
		String message = null;
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		Set<Map.Entry<String, String>> entrySet = param.entrySet();
		for (Map.Entry<String, String> e : entrySet) {
			String name = e.getKey();
			String value = e.getValue();
			NameValuePair pair = new BasicNameValuePair(name, value);
			params.add(pair);
		}
		HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8");
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		post.setEntity(reqEntity);
		CloseableHttpResponse response = httpclient.execute(post);
		if (response.getStatusLine().getStatusCode() ==  HttpStatus.SC_OK) {
			HttpEntity resEntity = response.getEntity();
			message = EntityUtils.toString(resEntity, "utf-8");
			System.out.println(message);
		} else {
			System.out.println("请求失败");
		}
		httpclient.close();
		return message;
	}

	public static String httpGet(String url, Map<String, String> param,
			Map<String, String> headers) throws ClientProtocolException,
			IOException {
		String message = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		CloseableHttpResponse response = httpclient.execute(get);
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			HttpEntity resEntity = response.getEntity();
			message = EntityUtils.toString(resEntity, "utf-8");
			System.out.println(message);
		} else {
			System.out.println("请求失败");
		}
		httpclient.close();
		return message;
	}

	public static void main(String args[]) throws IOException {
	}
}

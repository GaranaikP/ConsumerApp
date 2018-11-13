package com.app.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp {

	public static void main(String[] args) {
		String url="http://localhost:2018/ProviderApp/rest/msg";
		Client c=Client.create();
	WebResource wr=	c.resource(url);
	ClientResponse cr=wr.get(ClientResponse.class);
	String str=cr.getEntity(String.class);
	System.out.println(str);
	System.out.println(cr.getStatus());
	System.out.println(cr.getStatusInfo());
	}

}

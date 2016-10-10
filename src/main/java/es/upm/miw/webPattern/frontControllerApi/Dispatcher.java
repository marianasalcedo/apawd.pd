package es.upm.miw.webPattern.frontControllerApi;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Dispatcher {

	private Resource1 resource1 = new Resource1();
	private Resource2 resource2 = new Resource2();
	private Resource3 resource3 = new Resource3();

	public void doGet(HttpRequest request, HttpResponse response) {
		String result;
		switch (request.getPath()) {
		case "path1":
			// Injectar parámetros...
			result = resource1.method1(request.getParams().get("param"));
			response.setBody(result);
			break;
		case "path2":
			// Injectar parámetros...
			result = resource2.method1();
			response.setBody(result);
			break; 

		case "path4":
			// Injectar parámetros...
			result = resource3.method1();
			response.setBody(result);
			break; 

		default:
			response.setStatus(HttpStatus.NOT_FOUND);
			response.setBody("{\"error\": \"URL NOT FOUND\"}");
			break;
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		String result;
		switch (request.getPath()) {
		case "path1":
			// Injectar parámetros...
			result = resource1.method2();
			response.setBody(result);
			break;
		case "path3":
			// Injectar parámetros...
			result = resource1.method3();
			response.setBody(result);
			break;

		default:
			response.setStatus(HttpStatus.NOT_FOUND);
			response.setBody("{\"error\": \"URL NOT FOUND\"}");
			break;
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setBody("{\"error\": \"URL NOT FOUND\"}");
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setBody("{\"error\": \"URL NOT FOUND\"}");
	}

}

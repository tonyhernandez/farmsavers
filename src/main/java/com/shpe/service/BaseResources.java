package com.shpe.service;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseResources {
	
	private static final String accessControl = "*";
	private static final String accessControlMethods = "POST, PUT, GET, OPTIONS";
	private static final String accessControlHeaders = "origin , content-type, accept";

	/**
	 * Build a basic error response object
	 * @param key The key
	 * @param value The key's value
	 * @return Map with information
	 */
	protected Map<String, String> buildErrorResponse(String key, String value){
		Map<String, String> output = new HashMap<String, String>();
		output.put(key, value);
		return output;
	}
	
	/**
	 * Return the JSON representation of an object
	 * @param data The object
	 * @return The JSON string
	 */
	protected Response returnJSONResponse(Object data) {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(data));
	}
	
	/**
	 * Return the JSON representation of an object of an specific Type
	 * @param data The object
	 * @param type The type of the object
	 * @return The JSON string
	 */
	protected Response returnJSONResponse(Object data, Type type) {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(data, type));
	}

	/**
	 * Return the JSON representation of a name value pair 
	 * @param key The key
	 * @param value The value
	 * @return The JSON string
	 */
	protected Response returnJSONResponse(String key, String value){
		LinkedHashMap<String, String> output = new LinkedHashMap<String, String>();
		output.put("status", "success");
		output.put(key, value);
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(output));
	}
	
	/**
	 * Return the JSON representation of a hashmap of name value pairs
	 * @param data The hashmap of name value pairs
	 * @return The JSON string
	 */
	protected Response returnJSONResponse(LinkedHashMap<String, String> data){
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(data));
	}

	/**
	 * Return the JSON representation of an exception
	 * @param ex The exception
	 * @return The JSON string
	 */
	protected Response returnJSONResponse(Exception ex) {
		LinkedHashMap<String, String> output = new LinkedHashMap<String, String>();
		output.put("status", "error");
		output.put("message", ex.getMessage());
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(output));
	}

	/**
	 * Return the JSON representation of a application designated error
	 * @param error The error string
	 * @return The JSON response
	 */
	protected Response returnErrorResponse(String error) {
		LinkedHashMap<String, String> output = new LinkedHashMap<String, String>();
		output.put("status", "error");
		output.put("message", error);
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(output));
	}

	/**
	 * Return the JSON representation of a generic success
	 * @return The JSON response
	 */
	protected Response returnSuccessResponse() {
		LinkedHashMap<String, String> output = new LinkedHashMap<String, String>();
		output.put("status", "success");
		output.put("message", "");
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return this.buildResponse(gson.toJson(output));
	}

	/**
	 * Build the response object
	 * @param data The object data
	 * @return The Response object
	 */
	protected Response buildResponse(Object data) {
		return Response.ok(data).header("Access-Control-Allow-Origin",
				accessControl).header("Access-Control-Allow-Methods",
				accessControlMethods).header("Access-Control-Allow-Headers", 
						accessControlHeaders).build();
	}
}


package com.deepseek.util;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONArray;

public class GeminiAPIClient {
    private static final String API_KEY = "AIzaSyBtAilTSXmzMYVBCGuj4fBxAelglL7ggF8"; // Replace with your actual key
    private static final String ENDPOINT = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + API_KEY;
    
    public String callGeminiAPI(String userPrompt) {
        // Create JSON payload
        JSONObject requestBody = new JSONObject();
        requestBody.put("contents", new JSONArray()
            .put(new JSONObject()
                .put("parts", new JSONArray()
                    .put(new JSONObject().put("text", userPrompt))
                )
            )
        );

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ENDPOINT))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody.toString()))
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Return API response as a string
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: Unable to fetch response from Gemini API.";
        }
    }
}

import sun.net.www.http.HttpClient;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        HttpClient client = HttpClient.p

    }
}


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

class MyObject {
    private String field1;
    private String field2;

    // Getters and setters
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}

public class ApiCallExample {
    public static void main(String[] args) throws Exception {
        String url = "https://jsonplaceholder.typicode.com/posts";  // Fake URL for example

        // Create HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Create the HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Convert the response body into a list of MyObject using Gson
        Gson gson = new Gson();
        List<MyObject> myObjects = gson.fromJson(response.body(), new TypeToken<List<MyObject>>(){}.getType());

        // Output the deserialized objects
        for (MyObject obj : myObjects) {
            System.out.println("Field1: " + obj.getField1() + ", Field2: " + obj.getField2());
        }
    }
}

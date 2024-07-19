package com.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> nameInfo = new HashMap<>();
        nameInfo.put("name", "John");
        nameInfo.put("lastName", "Doe");

        Gson gson = new Gson();
        String json = gson.toJson(nameInfo);
        System.out.println(json);
    }
}

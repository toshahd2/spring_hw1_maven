package org.hw1.maven;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        gson.toJson("test");
        String str = gson.fromJson("\"test\"", String.class);
        System.out.println(str);
    }
}
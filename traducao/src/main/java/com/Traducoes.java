package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class Traducoes {
    
    JSONObject traducoes;

    public Traducoes(String filePath) throws IOException{

        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        traducoes = new JSONObject(content);

    }


}

package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Traducoes {
    
    private JSONObject traducao;

    public Traducoes(String filePath) throws IOException{

        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        traducao = new JSONObject(content);

    }

    public String get(String texto){

        return (traducao.getString(texto));

    }

    public String[] getArray(String texto){

        JSONArray array = traducao.getJSONArray(texto);
        String[] resultado = new String[array.length()];

        for(int i = 0; i < array.length(); i++){

            resultado[i] = array.getString(i);

        }

        return (resultado);

    }

}

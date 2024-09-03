package org.example;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("three", "five");
        Map<String, Object> data2 = new HashMap<>();
        data2.put("test", "test");
        data.put("second", data2);
        Person person = new Person("John", data);
        try {
            compiler(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void compiler(Object object) throws IOException {
        Handlebars handlebars = new Handlebars();
        Template template = handlebars.compileInline("{\n" +
                "\"name\": \"{{name}}\",\n" +
                "\"age\": \"{{age}}\",\n" +
                "\"other_data\": \"{{data.second.test}}\"\n" +
                "}");
        System.out.println(template.apply(object));
    }
}
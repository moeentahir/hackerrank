package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Client {

    private int id;
    private String name;

    Map<String, String> map = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

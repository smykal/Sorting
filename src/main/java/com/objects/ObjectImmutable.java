package com.objects;

public class ObjectImmutable {
    private final String value;

    public ObjectImmutable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

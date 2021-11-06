package com.objects;

final class ObjectValueObject {
    private final String carOwner;
    private final String carNumbers;

    ObjectValueObject(String carOwner, String carNumbers) {
        this.carOwner = carOwner;
        this.carNumbers = carNumbers;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public String getCarNumbers() {
        return carNumbers;
    }
}

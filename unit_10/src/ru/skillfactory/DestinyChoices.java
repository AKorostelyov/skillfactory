package ru.skillfactory;

public enum DestinyChoices {
    ARITHMETIC_EXCEPTION("Arithmetic"),
    ARRAY_OUT_OF_BOUND_EXCEPTION("ArrayOutOfBound"),
    ARRAY_STORE_EXCEPTION("ArrayStore"),
    CLASS_CAST_EXCEPTION("ClassCast"),
    NEGATIVE_ARRAY_SIZE_EXCEPTION("NegativeArraySize"),
    NULL_POINTER_EXCEPTION("NPE"),
    STRING_OUT_OF_BOUND_EXCEPTION("StringOutOfBound"),
    NUMBER_FORMAT_EXCEPTION("NumberFormat");

    public final String name;

    DestinyChoices(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

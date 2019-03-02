package me.seanksmith.jobfinder;

public enum RESPONSE_ERROR {
    UNEXPECTED("ERR-000001", "An unexpected excepstion has occurred");

    private final String code;
    private final String message;

    RESPONSE_ERROR(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
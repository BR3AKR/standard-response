package me.seanksmith.jobfinder;

import java.util.ArrayList;
import java.util.List;

public class StandardResponse {
    private List<RESPONSE_ERROR> errors;

    public StandardResponse() {
        errors = new ArrayList<>();
    }

    public void addError(RESPONSE_ERROR error) {
        errors.add(error);
    }

    public List<RESPONSE_ERROR> getErrors() {
        return this.errors;
    }
}

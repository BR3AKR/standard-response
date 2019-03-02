package me.seanksmith.jobfinder;

import java.util.ArrayList;
import java.util.List;

public class StandardResponse {
    public List<RESPONSE_ERROR> errors;

    public StandardResponse() {
        errors = new ArrayList<>();
    }

    public void addError(RESPONSE_ERROR error) {
        errors.add(error);
    }
}

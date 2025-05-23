package com.example.ua_parser.model;

import java.util.Map;

public class UserAgentResponse {
    private Map<String, String> parsedFields;

    public UserAgentResponse(Map<String, String> parsedFields) {
        this.parsedFields = parsedFields;
    }

    public Map<String, String> getParsedFields() {
        return parsedFields;
    }

    public void setParsedFields(Map<String, String> parsedFields) {
        this.parsedFields = parsedFields;
    }
}

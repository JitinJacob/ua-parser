package com.example.ua_parser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ua_parser.model.UserAgentRequest;
import com.example.ua_parser.model.UserAgentResponse;

@RestController
@RequestMapping("/api/useragent")
public class UserAgentController {

    @Autowired
    private UserAgentService service;

    @PostMapping("/parse")
    public UserAgentResponse parse(@RequestBody UserAgentRequest request) {
        return service.parse(request.getUserAgent());
    }
}


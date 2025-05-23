package com.example.ua_parser;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.ua_parser.model.UserAgentResponse;

import nl.basjes.parse.useragent.UserAgent;
import nl.basjes.parse.useragent.UserAgentAnalyzer;

@Service
public class UserAgentService {
    private final UserAgentAnalyzer analyzer;

    public UserAgentService() {
        this.analyzer = UserAgentAnalyzer
                .newBuilder()
                .hideMatcherLoadStats()
                .withCache(10000)
                .build();
    }

    public UserAgentResponse parse(String userAgent) {
        UserAgent agent = analyzer.parse(userAgent);

        Map<String, String> parsed = new HashMap<>();
        parsed.put("DeviceClass", agent.getValue("DeviceClass"));
        parsed.put("OperatingSystemName", agent.getValue("OperatingSystemName"));
        parsed.put("OperatingSystemVersion", agent.getValue("OperatingSystemVersion"));
        parsed.put("AgentName", agent.getValue("AgentName"));
        parsed.put("AgentVersion", agent.getValue("AgentVersion"));
        parsed.put("AgentInformationEmail", agent.getValue("AgentInformationEmail"));
        parsed.put("AgentLanguage", agent.getValue("AgentLanguage"));

        return new UserAgentResponse(parsed);
    }
}


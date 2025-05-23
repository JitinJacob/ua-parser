# ua-parser
UserAgent Parser using uap-java

#Steps
1. Run ```./gradlew clean build```
2. Run ```./gradlew bootRun```

Request:
```curl -X POST http://localhost:8080/api/useragent/getUserAgentInfo \ -H "Content-Type: application/json" \ -d '{"userAgent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/121.0.0.0 Safari/537.36"}'```

Response:
```{"parsedFields":{"OperatingSystemName":"Windows NT","AgentInformationEmail":"Unknown","AgentVersion":"121","DeviceClass":"Desktop","OperatingSystemVersion":"10.0","AgentName":"Chrome","AgentLanguage":"Unknown"}}```

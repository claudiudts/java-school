package com.lambdaschool.schools.exceptions;


import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class CustomErrorDetails extends DefaultErrorAttributes
{
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace)
    {

        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        //title: JSON OBJ
        //status: the HTTP
        //detail: message what the error is
        //timestamp: when it happened
        //developerMessage: some routing info, for developers
        Map<String, Object> rtnAttributes = new LinkedHashMap<>();

        rtnAttributes.put("title", errorAttributes.get("error"));
        rtnAttributes.put("status", errorAttributes.get("status"));
        rtnAttributes.put("detail", errorAttributes.get("message"));
        rtnAttributes.put("timestamp", new Date());
        rtnAttributes.put("developer", "path" + errorAttributes.get("path"));

        return rtnAttributes;
    }
}

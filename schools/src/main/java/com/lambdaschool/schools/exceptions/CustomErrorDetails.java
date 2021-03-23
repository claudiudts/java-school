package com.lambdaschool.schools.exceptions;


import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class CustomErrorDetails extends DefaultErrorAttributes
{
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace)
    {
        //title: JSON OBJ
        //status: the HTTP
        //detail: message what the error is
        //timestamp: when it happened
        //developerMessage: some routing info, for developers
    }
}

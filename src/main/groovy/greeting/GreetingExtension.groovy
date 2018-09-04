package com.ultimatedeployer.greeting

import org.gradle.api.tasks.Input


public class GreetingExtension
{
    private String source
    private String message


    @Input
    public String getTarget()
    {
        return source
    }

    public void setTarget(String target)
    {
        this.source = target
    }

    @Input
    public String getMessage()
    {
        return message
    }

    public void setMessage(String message)
    {
        this.message = message
    }
}

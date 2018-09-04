package com.ultimatedeployer.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.slf4j.Logger
import org.slf4j.LoggerFactory



public class GreetingPlugin implements Plugin<Project>
{

    public static String PLUGIN_ID = 'com.ultimatedeployer.greeting'

    Logger slf4jLogger = LoggerFactory.getLogger(this.getClass().getName())

    @Override
    public void apply(Project project)
    {
        GreetingExtension ext = project.getExtensions().create("greeting", GreetingExtension.class)

        project.task("greet").doLast({
            task ->
                    slf4jLogger.info(ext.getMessage() + ' ' + ext.getTarget())
        })
    }
}

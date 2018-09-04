package com.ultimatedeployer.greeting;

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.internal.TaskInternal
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

/**
 * Created by chris on 03.09.18.
 */
public class GreetingPluginJunitTest {
    @Test
    public void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.getPluginManager().apply(GreetingPlugin.PLUGIN_ID)
        Task helloTask = project.getTasks().getByName("greet")
        project.greeting.message = 'HI'
        project.greeting.target = 'by me'
        ((TaskInternal)helloTask).execute()

    }

}
### Status
[![Build Status](https://travis-ci.com/TheUltimateDeployer/GradleGreetingExamplePlugin.svg?branch=master)](https://www.travis-ci.com/TheUltimateDeployer/GradleGreetingExamplePlugin)

## Gradle Plugin Greeting example
This repository is intended to demonstrate a round trip usage to develop a Gradle plgun.

There are two execution methods demonstrated in this example:
1. Programmatically execution in the GreetingPluginJunitTest.groovy
2. Usage of the custom plugin in the build-custom.gradle file

### Usage

#### Building the plugin
The normal build file creates a Jar and publishes it to the local Maven repository.

Just call:
```./gradlew clean build```

#### Using the plugin

The custom build file uses the custom plugin and executes the default task 'greet'.

Just call: ```./gradlew -b build-custom.gradle build```

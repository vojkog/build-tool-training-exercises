/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/8.1.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.1-jre")

    implementation(project(":subprojects:sub1"))
    implementation(project(":subprojects:sub2"))
    implementation(project(":subprojects:sub3"))
    implementation(project(":subprojects:sub4"))
    implementation(project(":subprojects:sub5"))
    implementation(project(":subprojects:sub6"))
    implementation(project(":subprojects:sub7"))
    implementation(project(":subprojects:sub8"))
    implementation(project(":subprojects:sub9"))
    implementation(project(":subprojects:sub10"))
    implementation(project(":subprojects:sub11"))
    implementation(project(":subprojects:sub12"))
    implementation(project(":subprojects:sub13"))
    implementation(project(":subprojects:sub14"))
    implementation(project(":subprojects:sub15"))
    implementation(project(":subprojects:sub16"))
    implementation(project(":subprojects:sub17"))
    implementation(project(":subprojects:sub18"))
    implementation(project(":subprojects:sub19"))
    implementation(project(":subprojects:sub20"))
    implementation(project(":subprojects:sub21"))
    implementation(project(":subprojects:sub22"))
    implementation(project(":subprojects:sub23"))
    implementation(project(":subprojects:sub24"))
    implementation(project(":subprojects:sub25"))
    implementation(project(":subprojects:sub26"))
    implementation(project(":subprojects:sub27"))
    implementation(project(":subprojects:sub28"))
    implementation(project(":subprojects:sub29"))
    implementation(project(":subprojects:sub30"))
    implementation(project(":subprojects:sub31"))
    implementation(project(":subprojects:sub32"))
    implementation(project(":subprojects:sub33"))
    implementation(project(":subprojects:sub34"))
    implementation(project(":subprojects:sub35"))
    implementation(project(":subprojects:sub36"))
    implementation(project(":subprojects:sub37"))
    implementation(project(":subprojects:sub38"))
    implementation(project(":subprojects:sub39"))
    implementation(project(":subprojects:sub40"))
    implementation(project(":subprojects:sub41"))
    implementation(project(":subprojects:sub42"))
    implementation(project(":subprojects:sub43"))
    implementation(project(":subprojects:sub44"))
    implementation(project(":subprojects:sub45"))
    implementation(project(":subprojects:sub46"))
    implementation(project(":subprojects:sub47"))
    implementation(project(":subprojects:sub48"))
    implementation(project(":subprojects:sub49"))
    implementation(project(":subprojects:sub50"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

application {
    // Define the main class for the application.
    mainClass.set("com.gradlelab.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

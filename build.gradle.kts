plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    reports {
        html.required = true
        junitXml.required = true
        html.outputLocation = file("$buildDir/reports/tests/JUnit/html")
        junitXml.outputLocation = file("$buildDir/reports/tests/JUnit/xml")
    }
}
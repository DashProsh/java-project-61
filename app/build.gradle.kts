plugins {
    application
    java
    checkstyle
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
    id("jacoco")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy("jacocoTestReport") // Ссылаемся на задачу по имени, чтобы она выполнялась после тестов
}

tasks.named<JacocoReport>("jacocoTestReport") {
    dependsOn(tasks.test) // Задаем зависимость от задачи тестирования
    reports {
        xml.required.set(true)  // Генерация XML отчета
        html.required.set(true) // Генерация HTML отчета
    }
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.12.4"
}

tasks.withType<Checkstyle>().configureEach {
    reports {
        xml.required.set(false)
        html.required.set(true)
    }
}
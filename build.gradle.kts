import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.5" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
    id("com.github.bjornvester.xjc") version "1.8.2" apply false
    kotlin("jvm") version "1.9.20"
}

group = "de.richargh.sandbox.xsdjaxbgenerate"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}


allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}

subprojects {

    apply {
        plugin("io.spring.dependency-management")
    }

    the<DependencyManagementExtension>().apply {
        imports {
            mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform {
            excludeTags("excluded")
        }
        reports {
            junitXml.apply {
                isOutputPerTestCase = true // defaults to false
            }
        }
        testLogging {
            showExceptions = true
            showStandardStreams = true
            events("passed", "skipped", "failed")
        }
    }
}
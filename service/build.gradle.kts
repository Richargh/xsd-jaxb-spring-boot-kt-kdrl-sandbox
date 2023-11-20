plugins {
    id("org.springframework.boot")

    kotlin("jvm")
}

dependencies {
    /** Project dependencies **/
    implementation(project(":service-api"))

    /** Language dependencies **/
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    /** Main dependencies **/
    implementation("org.springframework.boot:spring-boot-autoconfigure")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")

    /** Test dependencies **/
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.assertj:assertj-core")
}

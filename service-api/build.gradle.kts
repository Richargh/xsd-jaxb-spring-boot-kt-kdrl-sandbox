plugins {
    id("com.github.bjornvester.xjc")

    kotlin("jvm")
}

xjc {
    // Set properties here...
    xsdDir.set(layout.projectDirectory.dir("src/main/xsd"))
//    bindingFiles.setFrom(layout.projectDirectory.dir("src/main/xjb").asFileTree.matching { include("**/*.xjb") })
//    markGenerated.set(true)
}

//compileKotlin {
//    dependsOn xjcGenerate
//}

//dependencies {
//    implementation("io.github.threeten-jaxb:threeten-jaxb-core:2.1.0")
//}
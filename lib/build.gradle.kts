plugins {
    id("java-library")
    id("kotlin")
}

repositories {
    jcenter()
}

tasks.withType(Test::class.java) {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup.retrofit2:retrofit:2.7.1")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.1")
    implementation("com.squareup.retrofit2:converter-jackson:2.7.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.10")

    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.0.6")
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.0.6")
}
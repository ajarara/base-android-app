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
    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.0.6")
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.0.6")
}
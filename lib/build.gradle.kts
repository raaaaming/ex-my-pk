repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")

    api("org.apache.commons:commons-math3:3.6.1")

    implementation("com.google.guava:guava:32.0.0-android")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

java {
    withSourcesJar() // 소스 jar 생성
    withJavadocJar() // API 문서 추가
}
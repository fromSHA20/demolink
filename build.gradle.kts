plugins {
	java
	id("org.springframework.boot") version "4.0.6"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webmvc")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
	testCompileOnly("org.projectlombok:lombok")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	testAnnotationProcessor("org.projectlombok:lombok")
	implementation("org.projectlombok:lombok:1.18.30")
	implementation("org.projectlombok:lombok-maven-plugin:1.18.20.0")
	implementation("org.projectlombok:lombok-maven:1.16.20.0")
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa") //dataJPA - автоматический генерирует SQL запросы для базы данных ) мост запросов из JAVA в SQL
	runtimeOnly ("org.postgresql:postgresql") //библиотека postgresSQL - помогает подключится к базе данных на ПК



}

tasks.withType<Test> {
	useJUnitPlatform()
}

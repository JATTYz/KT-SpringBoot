import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.3"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.openapi.generator") version "6.3.0"
	id("org.springdoc.openapi-gradle-plugin") version "1.6.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
}

group = "com.io.jt"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.openapitools:openapi-generator-gradle-plugin:6.3.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
sourceSets {
		main {
			java {
				// TODO: Set this path according to what was generated for you
				srcDir("$buildDir/generated/src/main/kotlin")
			}
		}
	}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}


openApiGenerate {
	generatorName.set("kotlin")
	inputSpec.set("$rootDir/src/main/resources/api-spec.yaml")
	outputDir.set("$buildDir/generated")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.register("t2") {
	println("$rootDir/src/main/resources/api-spec.yaml")
}



plugins {
	java
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
}

ext {
	set("springCloudVersion", "2022.0.1")
}
group = "com.feign.consumer"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	{
		exclude(group="org.junit.vintage", module=  "junit-vintage-engine")
	}

	implementation ("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.springframework.cloud:spring-cloud-starter-openfeign")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
dependencyManagement {
	imports {
		mavenBom ("org.springframework.cloud:spring-cloud-dependencies:2022.0.1")
	}
}
tasks.withType<Test> {
	useJUnitPlatform()
}

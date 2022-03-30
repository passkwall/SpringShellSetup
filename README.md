# SpringShell POC Test

## About
As of March 30, 2022, "SpringShell" RCE in the Spring web framework has been suspected of being a new "0 day".  This is a quick repository to set up an environment where non-java users can try out the POC and code.

It contains two API routes that literally don't do anything:
- GET /
- POST /post

Setup steps derived from Spring's quick setup for docker, but without the docker part
https://spring.io/guides/gs/spring-boot-docker/

## Setup

### Requirements
- openjdk@17
- Apache Maven (tested with v 3.8.4) 

### Steps
1. Clone this repository
2. `cd spring-boot-docker`
3. `mvn package -Dmaven.test.skip`
4. `java --jar target/spring-boot-docker-0.0.1-SNAPSHOT.jar` to run the server on port 8080
5. `python3 exploit.py --url http://localhost:8080`

## Notes
Inherently, this application does nothing so the exploit doesn't do anything like installing a WAR backdoor.  Feel free to modify `src/main/java/com/example/springbootdocker/SpringBootDockerApplication.java` to perform some serialization or request handling to see if you can get it to trigger.

Once I do a deep-dive, I'll add notes to `passkwall.net`.
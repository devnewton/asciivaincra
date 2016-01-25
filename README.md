# a2html

a2html is a KISS converter from text to ascii html powered by java and spring boot.

## Build, run and deploy manually

### Skill check

Please note that a thorough knowledge of Java web application development and hosting is required.

### Requirements

- JDK 7+
- Maven 3+

### Build

    mvn package

### Run locally

Run:

    java -jar target/a2html-*.jar

The frontend is now accessible on [locahost:8080](http://localhost:8080).

### Deploy and hosting on a production server

There is several options to deploy and host a2html. Here is one that requires:

- a domain name (example: mydomain.me).
- a web server with http proxy capabilities (example [Cherokee](http://cherokee-project.com/)).

#### Deployment

1. Build and launch a2html on the server.
2. Configure your web server to act as reverse proxy on http://localhost:8080

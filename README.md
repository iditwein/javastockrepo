# iditex

A small Java web application for Google App Engine. It serves a greeting page and a servlet that evaluates a fixed arithmetic expression.

The Eclipse project name is `iditex`. The App Engine application id is `javaiditwein` (version `2`).

## What it does

- `war/index.html` is the welcome page. It greets the user and links to the servlet.
- `IditexServlet` handles `GET /iditex`. It computes `(4 + 3) * 7` and returns the result as HTML: `(4+3)*7=49`.

## Project layout

```
src/com/myorg/javacourse/IditexServlet.java   Servlet implementation
src/META-INF/persistence.xml                 JPA settings (App Engine datastore)
src/META-INF/jdoconfig.xml                   JDO settings (App Engine datastore)
src/log4j.properties                         Log4j configuration
war/index.html                               Welcome page
war/WEB-INF/web.xml                          Servlet mapping
war/WEB-INF/appengine-web.xml                App Engine application config
war/WEB-INF/logging.properties               java.util.logging configuration
```

Compiled classes are written to `war/WEB-INF/classes`.

## Requirements

- Java (a JRE/JDK compatible with the App Engine Java runtime used by this project)
- Eclipse with the Google Plugin for Eclipse and the App Engine Java SDK

This project uses the Eclipse App Engine project layout. There is no Maven or Gradle build file.

## Run locally

1. Import the project into Eclipse as an existing project.
2. Confirm the Google App Engine SDK is on the project classpath (`GAE_CONTAINER`).
3. Run the project as a **Web Application** (Google App Engine local server).
4. Open the local URL Eclipse prints, then follow **Exercise 02 - Math** or go directly to `/iditex`.

## Deploy

Deploy from Eclipse with the Google Plugin, using the application id in `war/WEB-INF/appengine-web.xml` (`javaiditwein`). Change that id if you deploy to a different App Engine application.

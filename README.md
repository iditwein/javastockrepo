# iditex

A Java course exercise project that runs on **Google App Engine**. The app shows a home page and computes a simple math expression through a servlet.

App Engine application ID: `javaiditwein` (version 2).

## What the app does

- The home page (`index.html`) links to Exercise 02.
- The `/iditex` path runs `IditexServlet` and computes `(4 + 3) * 7 = 49`.

## Project structure

```
src/
  com/myorg/javacourse/IditexServlet.java   # Exercise 02 servlet
  META-INF/                                 # JPA/JDO config (App Engine Datastore)
  log4j.properties
war/
  index.html                                # Home page
  WEB-INF/
    web.xml                                 # Servlet mapping
    appengine-web.xml                       # App Engine config
```

## Requirements

- Java (JDK compatible with the Eclipse / App Engine project)
- Eclipse with the Google Plugin for Eclipse (or Google Cloud SDK for deploy)
- Google App Engine Java SDK

## Run locally

1. Open the project in Eclipse as a Google App Engine project.
2. Run the app on the local App Engine development server.
3. In the browser:
   - Home page: `http://localhost:8888/`
   - Exercise 02: `http://localhost:8888/iditex`

(The port may differ depending on your Eclipse settings.)

## Servlet

| Path      | Class                                      | Description                                      |
|-----------|--------------------------------------------|--------------------------------------------------|
| `/iditex` | `com.myorg.javacourse.IditexServlet`       | Computes `(num1 + num3) * num2` and returns HTML |

## Deploy

Deploy from Eclipse (Google App Engine) using the application ID in `war/WEB-INF/appengine-web.xml`.

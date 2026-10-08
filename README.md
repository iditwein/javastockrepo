# JavaStockRepo (iditex)

A Java web app from a developer course, built for **Google App Engine**. It includes a servlet that performs a simple math calculation.

App Engine application ID: `javaiditwein` (version 2).

## What it does

- The home page (`index.html`) links to the exercise.
- The `/iditex` path runs `IditexServlet` and returns HTML with this result:

  `(4 + 3) * 7 = 49`

## Project structure

```
src/com/myorg/javacourse/IditexServlet.java   # Math servlet
src/META-INF/                                 # JPA / DataNucleus config
src/log4j.properties
war/index.html                                # Home page
war/WEB-INF/web.xml                           # Servlet mapping
war/WEB-INF/appengine-web.xml                 # App Engine config
```

## Requirements

- Java JDK compatible with the Eclipse / App Engine project
- Eclipse with the Google Plugin for Eclipse / Google App Engine Java SDK
- The project is an Eclipse web application named `iditex`

## Run locally

1. Open the project in Eclipse.
2. Run it as a **Web Application** (App Engine Development Server).
3. In the browser:
   - Home page: `http://localhost:8888/`
   - Calculation: `http://localhost:8888/iditex`

## Servlet mapping

| Servlet | Class | URL |
|---------|--------|-----|
| Iditex | `com.myorg.javacourse.IditexServlet` | `/iditex` |

# iditex

A Java Servlet app for a Java course, deployed on **Google App Engine**. It includes a welcome page and a servlet that evaluates a math expression and shows the result in the browser.

## What it does

- The home page (`/`) shows a greeting and a link to the exercise.
- The `/iditex` path runs `IditexServlet`, which computes `(4 + 3) * 7` and returns HTML with the result.

## Project structure

```
src/com/myorg/javacourse/IditexServlet.java   # main servlet
src/META-INF/persistence.xml                  # JPA config (DataNucleus / App Engine)
war/index.html                                # home page
war/WEB-INF/web.xml                           # servlet mapping
war/WEB-INF/appengine-web.xml                 # App Engine config
```

## Requirements

- Java (JRE compatible with the Eclipse project)
- [Eclipse](https://www.eclipse.org/) with the Google App Engine / Google Plugin for Eclipse
- Google App Engine Java SDK (bundled with the plugin)

## Run locally

1. Open the project in Eclipse (`iditex`).
2. Run as a **Web Application** (Google App Engine local server).
3. In the browser:
   - Home page: `http://localhost:8888/`
   - Exercise: `http://localhost:8888/iditex`

## Deploy to App Engine

The application ID in `appengine-web.xml` is `javaiditwein` (version `2`).

From Eclipse: **Google App Engine → Deploy to App Engine**.

## Tech stack

- Java Servlets (Java EE 2.5)
- Google App Engine
- JPA / DataNucleus (configured, not used by the servlet yet)
- Eclipse Web Tools

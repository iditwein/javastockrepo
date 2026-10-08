# iditex

A Java Google App Engine (Eclipse) app from a Java course. It serves a home page and a servlet that evaluates a simple arithmetic expression and returns the result as HTML.

## Project structure

```
src/com/myorg/javacourse/IditexServlet.java   # main servlet
src/META-INF/                                 # JPA / JDO config
war/index.html                                # home page
war/WEB-INF/web.xml                           # servlet mappings
war/WEB-INF/appengine-web.xml                 # App Engine config
```

App Engine application id: `javaiditwein` (version 2).

## What it does

- The home page (`/`) shows a greeting and a link to the exercise.
- `/iditex` runs `IditexServlet`, which computes `(4 + 3) * 7` and writes the result as an HTML heading.

## Requirements

- Java (JRE compatible with the Eclipse project)
- [Google Plugin for Eclipse](https://developers.google.com/eclipse/) / Google App Engine SDK
- Eclipse with Web Tools and App Engine support

## Run locally

1. Open the project in Eclipse (`iditex`).
2. Run as a **Web Application** (Google App Engine local server).
3. In the browser:
   - Home page: `http://localhost:8888/`
   - Math exercise: `http://localhost:8888/iditex`

## Deploy

Configuration lives in `war/WEB-INF/appengine-web.xml`. Deploy from Eclipse using Google App Engine (**Deploy to App Engine**).

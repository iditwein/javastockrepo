# javastockrepo (iditex)

A Java Google App Engine web app from a Java course. It exposes a servlet that evaluates a math expression and displays the result in the browser.

## Tech stack

- Java Servlet (`HttpServlet`)
- Google App Engine
- Eclipse Web Tools / Google Plugin for Eclipse
- JPA (DataNucleus) — configured but unused in the current exercise

## Project layout

```
src/com/myorg/javacourse/IditexServlet.java   # Main servlet
src/META-INF/persistence.xml                  # JPA config
war/index.html                                # Home page
war/WEB-INF/web.xml                           # Servlet mapping
war/WEB-INF/appengine-web.xml                 # App Engine config
```

## What it does

The home page (`index.html`) links to:

- **Exercise 02 - Math** — path `/iditex`

`IditexServlet` computes `(4 + 3) * 7` and returns the result as HTML.

## Run locally

1. Open the project in Eclipse with the Google Plugin for Eclipse / App Engine SDK.
2. Run it as a Web Application.
3. In the browser:
   - Home: `http://localhost:8888/`
   - Exercise: `http://localhost:8888/iditex`

## Deploy to App Engine

From `appengine-web.xml`:

- Application ID: `javaiditwein`
- Version: `2`

Deploy from Eclipse (Deploy to App Engine) or with the App Engine SDK.

## Servlet mapping

| Servlet | Class | Path |
| --- | --- | --- |
| Iditex | `com.myorg.javacourse.IditexServlet` | `/iditex` |

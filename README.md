# iditex

A Java Google App Engine web app (Eclipse / GAE). It includes a home page and a servlet that evaluates a simple arithmetic expression.

App Engine application ID: `javaiditwein` (version 2).

## Requirements

- JDK compatible with this Eclipse / App Engine Java project
- Eclipse with the Google Plugin for Eclipse / Google App Engine SDK
- Google App Engine Java SDK

## Project structure

```
src/com/myorg/javacourse/   Java source (servlets)
src/META-INF/               Persistence config (JPA / JDO)
war/                        Web app content
  index.html                Home page
  WEB-INF/web.xml           Servlet mappings
  WEB-INF/appengine-web.xml App Engine settings
```

## Run locally

1. Open the project in Eclipse as a Google App Engine project.
2. Run it with Google App Engine (Run on Development Server).
3. In the browser:

| Path | Description |
|------|-------------|
| `/` | Home page (`index.html`) |
| `/iditex` | Exercise 02 — computes `(4 + 3) * 7` |

## Servlet

`IditexServlet` (`com.myorg.javacourse.IditexServlet`) is mapped to `/iditex` in `web.xml`. On GET it returns HTML with the result of `(num1 + num3) * num2`.

## Deploy to App Engine

From Eclipse: **Deploy to App Engine**, or use the App Engine SDK tools with the settings in `war/WEB-INF/appengine-web.xml`.

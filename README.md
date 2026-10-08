# javastockrepo (iditex)

A Java course app that runs on **Google App Engine** using Java Servlets.

App Engine application id: `javaiditwein`.

## What it does

- Home page: `war/index.html` — greeting and a link to the exercise.
- Servlet: `IditexServlet` at `/iditex` (Exercise 02 – Math).
- Calculation: `(4 + 3) * 7`, shown as HTML.

## Stack

- Java (Servlet API 2.5)
- Google App Engine (Eclipse plugin / GAE)
- JPA / JDO configured for Datastore (not used in application code yet)

## Project layout

```
src/com/myorg/javacourse/   Java source
src/META-INF/               persistence (JPA/JDO)
war/index.html              home page
war/WEB-INF/web.xml         servlet mappings
war/WEB-INF/appengine-web.xml  App Engine config
```

## Run locally

This is an Eclipse Web App project with the Google Plugin for Eclipse.

1. Open this folder in Eclipse as an existing App Engine project.
2. Make sure the Google App Engine SDK is installed and on the classpath.
3. Run: **Run As → Web Application**.
4. In the browser:
   - Home: `http://localhost:8888/`
   - Math exercise: `http://localhost:8888/iditex`

## Deploy to App Engine

From Eclipse: **Deploy to App Engine**, using application `javaiditwein` (version `2` in `appengine-web.xml`).

## License

Educational project.

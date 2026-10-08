# javastockrepo (iditex)

A Java Google App Engine web app for a Java course. It is an Eclipse Web Application that serves a simple math exercise through a servlet.

## What it does

- The home page (`index.html`) shows a greeting and a link to the exercise.
- The `/iditex` path runs `IditexServlet`, which computes `(4 + 3) * 7` and returns the result as HTML.

## Project layout

```
src/com/myorg/javacourse/IditexServlet.java  # Exercise servlet
src/META-INF/                                # JPA / JDO config (App Engine Datastore)
war/index.html                               # Home page
war/WEB-INF/web.xml                          # Servlet mapping
war/WEB-INF/appengine-web.xml                # App Engine settings
```

| Item | Value |
|------|--------|
| Eclipse project name | `iditex` |
| Application ID | `javaiditwein` |
| Deploy version | `2` |
| SDK | Google App Engine Java 1.9.17 |

## Requirements

- Java (JRE matching the Eclipse project)
- Eclipse with the [Google Plugin for Eclipse](https://developers.google.com/eclipse/) / Google App Engine Java SDK
- A Google Cloud account if you want to deploy remotely

## Run locally

1. Open the project in Eclipse.
2. Run it as a **Web Application** (Google App Engine local server).
3. In the browser:
   - Home page: `http://localhost:8888/`
   - Exercise: `http://localhost:8888/iditex`

## Deploy

Settings live in `war/WEB-INF/appengine-web.xml`. Deploy from Eclipse with **Deploy to App Engine**, or with the App Engine SDK tools.

## Stack

- Java Servlets 2.5
- Google App Engine (Java)
- JPA / JDO + DataNucleus (ready for Datastore; the current exercise does not use persistence)

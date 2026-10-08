# iditex

A Java web app for a course exercise, deployed on **Google App Engine**.  
It shows a welcome page and computes a simple math expression through a servlet.

## What it does

- The home page (`index.html`) greets the user and links to the exercise.
- The `/iditex` path runs `IditexServlet`, which computes `(4 + 3) * 7` and returns the result as HTML.

## Tech stack

- Java Servlet (Java EE 2.5)
- Google App Engine (Java)
- Eclipse Web Tools / Google Plugin for Eclipse
- JPA / DataNucleus (configured for App Engine)

## Project structure

```
src/
  com/myorg/javacourse/IditexServlet.java   # Math exercise servlet
  META-INF/persistence.xml                  # JPA config
  log4j.properties
war/
  index.html                                # Home page
  WEB-INF/
    web.xml                                 # Servlet mapping
    appengine-web.xml                       # App Engine config
```

App Engine application ID: `javaiditwein` (version `2`).

## Requirements

- Java JDK compatible with App Engine Java / Eclipse
- Eclipse with the [Google Plugin for Eclipse](https://developers.google.com/eclipse/) and the Google App Engine SDK
- A Google Cloud account (for cloud deployment)

## Run locally

1. Open the project in Eclipse.
2. Run it as a **Web Application** (App Engine development server).
3. Open the local server URL in a browser (typically `http://localhost:8888/`).
4. From the home page, click **Exercise 02 - Math**, or go directly to `/iditex`.

## Deploy to App Engine

From Eclipse: **Google App Engine → Deploy to App Engine**, or use the SDK deploy tools with the settings in `war/WEB-INF/appengine-web.xml`.

## Endpoints

| Path      | Description                                      |
|-----------|--------------------------------------------------|
| `/`       | Home page (`index.html`)                         |
| `/iditex` | Computes `(num1 + num3) * num2` and shows the result |

## License

Educational project.

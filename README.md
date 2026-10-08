# iditex

A Java web application for Google App Engine (Eclipse project). It serves a welcome page and a servlet that evaluates a simple math expression.

The App Engine application id is `javaiditwein` (version `2`).

## What the app does

- `war/index.html` — a welcome page with a link to the exercise.
- `/iditex` — `IditexServlet` computes `(4 + 3) * 7` and returns the result as HTML.

## Project layout

```
src/com/myorg/javacourse/IditexServlet.java   Exercise servlet
src/META-INF/jdoconfig.xml                    JDO settings for Datastore
src/META-INF/persistence.xml                  JPA settings for Datastore
war/index.html                                Home page
war/WEB-INF/web.xml                           Servlet mapping
war/WEB-INF/appengine-web.xml                 App Engine configuration
```

Compiled classes are written to `war/WEB-INF/classes`.

## Requirements

- Eclipse with the Google Plugin for Eclipse (App Engine)
- Java 7 (project compliance level is `1.7`)
- Google App Engine Java SDK

## Run locally

1. Import the project into Eclipse (**File → Import → Existing Projects into Workspace**).
2. Confirm the App Engine SDK is configured for the project.
3. Run it as a **Web Application** (local App Engine server).
4. Open the home page, then follow **Exercise 02 - Math** (`/iditex`).

## Endpoints

| Path | Description |
| --- | --- |
| `/` | Home page (`index.html`) |
| `/iditex` | Result of `(num1 + num3) * num2` |

The values are currently hardcoded: `num1 = 4`, `num2 = 7`, `num3 = 3`, so the result is `49`.

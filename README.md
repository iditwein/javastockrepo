# iditex

A Java web application for Google App Engine. The project includes a home page and a servlet that displays the result of a math exercise (Exercise 02).

## Requirements

- Java 7 (the project is set to source/target 1.7)
- Eclipse with the Google Plugin for Eclipse / Google App Engine SDK
- Google App Engine Java SDK

## Project structure

```
src/com/myorg/javacourse/IditexServlet.java   # main servlet
war/index.html                                 # home page
war/WEB-INF/web.xml                            # servlet mapping
war/WEB-INF/appengine-web.xml                  # App Engine config
src/META-INF/persistence.xml                   # JPA (DataNucleus / App Engine)
```

App Engine application ID: `javaiditwein` (version 2).

## Run locally

1. Open the project in Eclipse (`iditex`).
2. Run it as a Web Application using Google App Engine.
3. In the browser:
   - Home page: `http://localhost:8888/`
   - Exercise: `http://localhost:8888/iditex`

## What the servlet does

`IditexServlet` is mapped to `/iditex`. On a GET request it computes:

`(4 + 3) * 7 = 49`

and returns the result as HTML.

A link to this page appears on `index.html` as **Exercise 02 - Math**.

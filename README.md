# iditex

A Java web application for Google App Engine. The home page links to a math exercise, and the servlet calculates the result and returns it as HTML.

## What the app does

The home page (`war/index.html`) shows the heading "Hello Idit" and a link to the exercise.

The `IditexServlet` servlet evaluates `(4 + 3) * 7` and returns the result `49`.

## Project structure

```
src/com/myorg/javacourse/IditexServlet.java   the servlet
src/META-INF/                                 JDO and JPA configuration
war/index.html                                home page
war/WEB-INF/web.xml                           servlet mapping
war/WEB-INF/appengine-web.xml                 App Engine configuration
war/WEB-INF/lib/                              App Engine and DataNucleus libraries
```

The servlet is mapped to `/iditex` in `web.xml`. The App Engine application id is `javaiditwein`, version `2`.

## Requirements

- Eclipse with the Google Plugin for Eclipse
- App Engine Java SDK 1.9.17
- Java (the Eclipse project name is `iditex`)

## Run locally

1. Import the project into Eclipse (**File → Import → Existing Projects into Workspace**).
2. Right-click the project and choose **Run As → Web Application**.
3. Open the local development server in a browser (usually `http://localhost:8888/`).
4. Click **Exercise 02 - Math** to see the calculation result.

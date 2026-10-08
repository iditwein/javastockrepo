# Java Stock / Iditex

A Java web application built for a Java developers course. It runs on **Google App Engine** and exposes a simple servlet that evaluates a math expression and returns the result as HTML.

Eclipse project name: **iditex**  
App Engine application id: **javaiditwein**

## What it does

The home page (`index.html`) links to **Exercise 02 - Math**. That page is served by `IditexServlet`, which computes:

```text
(num1 + num3) * num2
(4 + 3) * 7 = 49
```

and prints the result in an `<h1>` heading.

## Tech stack

- Java servlet (`javax.servlet`)
- Google App Engine Java SDK (API 1.9.17)
- Eclipse with Google Plugin for Eclipse (GPE)
- JPA / JDO (DataNucleus) configured for App Engine, ready for later persistence work

## Project layout

```text
src/com/myorg/javacourse/IditexServlet.java   Servlet implementation
src/META-INF/                                 JPA and JDO persistence config
war/index.html                                Welcome page
war/WEB-INF/web.xml                           Servlet mapping
war/WEB-INF/appengine-web.xml                 App Engine app id and version
war/WEB-INF/lib/                              App Engine and DataNucleus JARs
```

## Endpoints

| Path      | Description                          |
|-----------|--------------------------------------|
| `/`       | Welcome page with a link to the exercise |
| `/iditex` | Math servlet (`IditexServlet`)       |

## How to run locally

1. Open the project in **Eclipse** with the Google Plugin for Eclipse.
2. Make sure the Google App Engine Java SDK is installed and attached to the project.
3. Run the app as a **Web Application**.
4. In the browser, open:
   - `http://localhost:8888/` — home page
   - `http://localhost:8888/iditex` — math exercise

The default local port is usually `8888`; use the port shown in the Eclipse console if it differs.

## How to deploy

From Eclipse: **Google App Engine → Deploy to App Engine**.

Configuration lives in `war/WEB-INF/appengine-web.xml`:

- Application: `javaiditwein`
- Version: `2`
- Thread-safe: enabled

## Requirements

- JDK 7 (typical for App Engine 1.9.x)
- Eclipse with Google Plugin for Eclipse
- Google App Engine Java SDK

## License

Course / educational project. No license specified.

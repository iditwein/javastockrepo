# Java Stock / Iditex

A Java web application built for a Java course exercise. It runs on **Google App Engine** (Java servlet container) and demonstrates a simple HTTP servlet that computes a math expression and returns HTML.

Eclipse project name: **iditex**  
App Engine application ID: **javaiditwein**

## Features

- Welcome page with a link to the exercise servlet
- `IditexServlet` (`GET /iditex`) calculates `(4 + 3) * 7` and prints the result as HTML

Example output:

```text
Result of (4+3)*7=49
```

## Tech stack

- Java servlet (`javax.servlet`)
- Google App Engine Java runtime
- Eclipse with Google Plugin for Eclipse (GPE / GDT)
- Optional JPA / DataNucleus persistence config (not used by the current servlet)

## Project structure

```text
src/
  com/myorg/javacourse/IditexServlet.java   # servlet that performs the math exercise
  META-INF/persistence.xml                  # JPA persistence unit
  META-INF/jdoconfig.xml                    # JDO config
  log4j.properties
war/
  index.html                                # welcome page
  WEB-INF/
    web.xml                                 # servlet mapping
    appengine-web.xml                       # App Engine app config
    logging.properties
```

Compiled classes are output to `war/WEB-INF/classes`.

## Prerequisites

- Java JDK (compatible with the Eclipse JRE used by the project)
- [Eclipse](https://www.eclipse.org/) with the **Google Plugin for Eclipse** and the **Google App Engine Java SDK**
- A Google Cloud / App Engine account if you want to deploy

## Getting started

1. Clone this repository and import it into Eclipse as an existing project (`iditex`).
2. Ensure the App Engine SDK is attached (the project uses the `GAE_CONTAINER` classpath).
3. Run locally with **Run As → Web Application**.
4. Open the local server URL in a browser (typically `http://localhost:8888`).

### Endpoints

| Path        | Description                                      |
|-------------|--------------------------------------------------|
| `/`         | Welcome page (`index.html`)                      |
| `/iditex`   | Exercise 02 – Math (`IditexServlet`)              |

The servlet is mapped in `war/WEB-INF/web.xml`.

## Deploying to App Engine

The application ID and version are set in `war/WEB-INF/appengine-web.xml`:

- Application: `javaiditwein`
- Version: `2`
- Thread-safe: `true`

From Eclipse, use **Deploy to App Engine** after you are signed in with an account that owns that application.

## License

Educational / course project. No license file is included.

# Iditex

A Java web app for a Java course, running on **Google App Engine**.

The project serves a simple home page and a servlet that evaluates a math expression and returns the result as HTML.

## What it does

- The home page (`index.html`) links to **Exercise 02 - Math**.
- The `/iditex` path runs `IditexServlet`, which computes `(4 + 3) * 7` and prints the result.

## Tech stack

- Java Servlet API 2.5
- Google App Engine (Java)
- Eclipse (Google Plugin / GDT)
- JPA / DataNucleus (configured in the project, not used by the current servlet)

App Engine application ID: `javaiditwein`

## Project structure

```
javastockrepo-1/
├── src/
│   ├── com/myorg/javacourse/IditexServlet.java   # Exercise servlet
│   ├── META-INF/persistence.xml                  # JPA config
│   └── log4j.properties
├── war/
│   ├── index.html                                # Home page
│   └── WEB-INF/
│       ├── web.xml                               # Servlet mapping
│       └── appengine-web.xml                     # App Engine config
├── .project / .classpath                         # Eclipse
└── README.md
```

## Run locally

1. Open the project in Eclipse with Google Plugin for Eclipse.
2. Make sure the Google App Engine SDK is installed (this project is set up for SDK 1.9.17).
3. Run as a **Web Application**.
4. In the browser:
   - Home: `http://localhost:8888/`
   - Exercise: `http://localhost:8888/iditex`

## Endpoints

| Path      | Description                                          |
|-----------|------------------------------------------------------|
| `/`       | Home page with a link to the exercise                |
| `/iditex` | `IditexServlet` — computes `(num1 + num3) * num2`    |

## Deploy

Deploy from Eclipse to Google App Engine:

- Application: `javaiditwein`
- Version: `2`

## Author

Idit Weinstein

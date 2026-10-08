# Java Stock / iditex

Google App Engine Java web app from a Java course. The current exercise exposes a simple servlet that computes a fixed arithmetic expression and returns HTML.

| | |
| --- | --- |
| **Eclipse project** | `iditex` |
| **Package** | `com.myorg.javacourse` |
| **App Engine app id** | `javaiditwein` |
| **SDK** | App Engine Java SDK 1.9.17 |

## Features

- Welcome page with a link to the exercise servlet
- `IditexServlet` evaluates `(4 + 3) * 7` and writes the result as an HTML heading
- Standard App Engine WAR layout with JPA/DataNucleus persistence config (ready for later exercises)

## Endpoints

| Path | Handler | Description |
| --- | --- | --- |
| `/` | `war/index.html` | Welcome page (`Hello Idit`) |
| `/iditex` | `IditexServlet` | Exercise 02 — math result as HTML |

## Prerequisites

- [Eclipse](https://www.eclipse.org/) with the **Google Plugin for Eclipse** / App Engine tools
- Java JDK compatible with App Engine Java 7/8-era projects
- Google App Engine Java SDK (bundled with the plugin; project references SDK **1.9.17**)

## Run locally

1. Import this folder into Eclipse as an existing project.
2. Ensure the Google App Engine facet/SDK is configured for the project.
3. Run as **Web Application**.
4. Open the welcome page in your browser (typically `http://localhost:8888/`), then follow **Exercise 02 - Math** or go to `/iditex` directly.

Compiled classes are written to `war/WEB-INF/classes`.

## Project structure

```
javastockrepo/
├── src/
│   ├── com/myorg/javacourse/
│   │   └── IditexServlet.java    # GET /iditex
│   ├── META-INF/
│   │   ├── persistence.xml       # JPA unit (App Engine Datastore)
│   │   └── jdoconfig.xml
│   └── log4j.properties
└── war/
    ├── index.html                # Welcome page
    ├── favicon.ico
    └── WEB-INF/
        ├── web.xml               # Servlet mapping
        ├── appengine-web.xml     # App id, version, logging
        ├── logging.properties
        ├── classes/              # Build output
        └── lib/                  # App Engine + DataNucleus JARs
```

## Configuration notes

- Servlet mapping lives in `war/WEB-INF/web.xml` (`Iditex` → `/iditex`).
- App Engine settings (application id, version `2`, threadsafe) are in `war/WEB-INF/appengine-web.xml`.
- Persistence unit `transactions-optional` uses the DataNucleus JPA provider with App Engine Datastore.

## Deploy

Deploy from Eclipse with **Deploy to App Engine**, or with the App Engine SDK tools against the `war/` directory. The remote application id is `javaiditwein`.

## License

Course / educational project — no separate license file is included.

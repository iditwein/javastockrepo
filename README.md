# javastockrepo (iditex)

A Java Servlet course app that runs on **Google App Engine**. The Eclipse project name is `iditex`. The App Engine application ID is `javaiditwein`.

## What it does

The home page (`/`) shows a greeting and a link to the exercise. `IditexServlet` is mapped to `/iditex`. It evaluates `(4 + 3) * 7` and returns the result as HTML.

## Project layout

```
src/
  com/myorg/javacourse/IditexServlet.java   # Exercise 02 servlet
  META-INF/persistence.xml                  # JPA config (App Engine Datastore)
  META-INF/jdoconfig.xml                    # JDO config
  log4j.properties
war/
  index.html                                # Home page
  WEB-INF/web.xml                           # Servlet mappings
  WEB-INF/appengine-web.xml                 # App Engine settings
```

## Requirements

- Java (JRE/JDK compatible with the Eclipse project)
- Eclipse with the Google App Engine / Google Plugin for Eclipse
- Google App Engine Java SDK (via the Eclipse plugin)

## Run locally

1. Open the project in Eclipse (File → Import → Existing Projects into Workspace).
2. Make sure the Google App Engine SDK is attached to the project.
3. Run it as a **Web Application** (Run as → Web Application).
4. In the browser:
   - Home: `http://localhost:8888/`
   - Exercise 02: `http://localhost:8888/iditex`

## Deploy to App Engine

Deploy settings live in `war/WEB-INF/appengine-web.xml`:

- Application ID: `javaiditwein`
- Version: `2`

From Eclipse: Deploy to App Engine (after signing in with a Google account that can access the app).

## Endpoints

| Path     | Description                                      |
|----------|--------------------------------------------------|
| `/`      | Home page (`index.html`)                         |
| `/iditex`| Computes `(num1 + num3) * num2` and shows it     |

## License

Educational project.

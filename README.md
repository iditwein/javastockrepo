# iditex

A Java application for Google App Engine. The home page links to a servlet that evaluates `(4 + 3) * 7` and returns the result as HTML.

App Engine application id: `javaiditwein` (version 2).

## Project structure

```
src/com/myorg/javacourse/IditexServlet.java   exercise servlet
src/META-INF/                                 JDO and JPA configuration
war/index.html                                home page
war/WEB-INF/web.xml                           servlet mapping
war/WEB-INF/appengine-web.xml                 App Engine configuration
```

## Endpoints

| Path | Description |
| --- | --- |
| `/` | Home page (`index.html`) with a link to the exercise |
| `/iditex` | `IditexServlet` — returns `(4+3)*7=49` |

## Run locally

The project is an Eclipse project that uses the Google Plugin for Eclipse.

1. Import the project into Eclipse (File → Import → Existing Projects into Workspace).
2. Run it as a Web Application (Run As → Web Application).
3. Open `http://localhost:8888/` in a browser, then follow the Exercise 02 - Math link.

The local App Engine development server serves the `war/` directory. Class files are written to `war/WEB-INF/classes`.

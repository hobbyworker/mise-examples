# lang/java

The word counter from [mise by Language (4): Java and Gradle](https://hobbyworker.me/en/dev/2026-10-27-mise-by-language-4-java-and-gradle/). It prints the number of words in `sample.txt` and the three most common ones, the same as the other folders in `lang/`.

```bash
cd lang/java
mise install
mise tasks ls
mise run ci
```

`mise.toml` pins the language and defines the tasks. The language's own tool manages the dependencies and their lockfile.

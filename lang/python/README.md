# lang/python

The word counter from [mise by Language (1): Python and uv](https://hobbyworker.me/en/dev/2026-10-24-mise-by-language-1-python-and-uv/). It prints the number of words in `sample.txt` and the three most common ones, the same as the other folders in `lang/`.

```bash
cd lang/python
mise install
mise tasks ls
mise run ci
```

`mise.toml` pins the language and defines the tasks. The language's own tool manages the dependencies and their lockfile.

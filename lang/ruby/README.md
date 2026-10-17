# lang/ruby

The word counter from [mise by Language (3): Ruby and Bundler](https://hobbyworker.me/en/dev/2026-10-26-mise-by-language-3-ruby-and-bundler/). It prints the number of words in `sample.txt` and the three most common ones, the same as the other folders in `lang/`.

```bash
cd lang/ruby
mise install
mise tasks ls
mise run ci
```

`mise.toml` pins the language and defines the tasks. The language's own tool manages the dependencies and their lockfile.

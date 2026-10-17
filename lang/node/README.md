# lang/node

The word counter from [mise by Language (2): Node.js with npm and pnpm](https://hobbyworker.me/en/dev/2026-10-25-mise-by-language-2-nodejs-npm-pnpm/). It prints the number of words in `sample.txt` and the three most common ones, the same as the other folders in `lang/`.

```bash
cd lang/node
mise install
mise tasks ls
mise run ci
```

`mise.toml` pins the language and defines the tasks. The language's own tool manages the dependencies and their lockfile.

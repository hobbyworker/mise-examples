# lang/rust

The word counter from [mise by Language (5): Rust and cargo](https://hobbyworker.me/en/dev/2026-10-28-mise-by-language-5-rust-and-cargo/). It prints the number of words in `sample.txt` and the three most common ones, the same as the other folders in `lang/`.

```bash
cd lang/rust
mise install
mise tasks ls
mise run ci
```

`mise.toml` pins the language and defines the tasks. The language's own tool manages the dependencies and their lockfile.

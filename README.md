# mise-examples

[![CI](https://github.com/hobbyworker/mise-examples/actions/workflows/ci.yml/badge.svg)](https://github.com/hobbyworker/mise-examples/actions/workflows/ci.yml)

Sample code for two series on hobbyworker.me: the [mise Guide](https://hobbyworker.me/en/series/mise-guide/) and [mise by Language](https://hobbyworker.me/en/series/mise-by-language/). [mise](https://mise.jdx.dev/) installs and switches the versions of languages and dev tools per project, sets per-directory environment variables, and runs project tasks.

## mise Guide

| Part | Post | Folder |
|---|---|---|
| 1 | [Installation and Shell Activation](https://hobbyworker.me/en/dev/2026-10-18-mise-guide-1-install-and-activation/) | (commands only) |
| 2 | [Installing Tools and Switching Versions](https://hobbyworker.me/en/dev/2026-10-19-mise-guide-2-tools-and-versions/) | [`guide/02-tools`](guide/02-tools) |
| 3 | [Per-Directory Environment Variables](https://hobbyworker.me/en/dev/2026-10-20-mise-guide-3-environment-variables/) | [`guide/03-env`](guide/03-env) |
| 4 | [Running Tasks with mise run](https://hobbyworker.me/en/dev/2026-10-21-mise-guide-4-tasks/) | [`guide/04-tasks`](guide/04-tasks) |
| 5 | [Legacy Version Files and Lockfiles](https://hobbyworker.me/en/dev/2026-10-22-mise-guide-5-version-files-and-lockfile/) | [`guide/05-version-files`](guide/05-version-files) |
| 6 | [Using mise in GitHub Actions and Docker](https://hobbyworker.me/en/dev/2026-10-23-mise-guide-6-github-actions-and-docker/) | [`.github/workflows/ci.yml`](.github/workflows/ci.yml), [`guide/06-docker`](guide/06-docker) |

## mise by Language

The same small program, a word counter with a test, in each language. Each folder has a `mise.toml` that pins the language and runs the language's own package tool. Part 6 is a small Hugo site instead, which needs Hugo and Go.

| Part | Post | Folder |
|---|---|---|
| 1 | [Python and uv](https://hobbyworker.me/en/dev/2026-10-24-mise-by-language-1-python-and-uv/) | [`lang/python`](lang/python) |
| 2 | [Node.js, npm, and pnpm](https://hobbyworker.me/en/dev/2026-10-25-mise-by-language-2-nodejs-npm-pnpm/) | [`lang/node`](lang/node) |
| 3 | [Ruby and Bundler](https://hobbyworker.me/en/dev/2026-10-26-mise-by-language-3-ruby-and-bundler/) | [`lang/ruby`](lang/ruby) |
| 4 | [Java and Gradle](https://hobbyworker.me/en/dev/2026-10-27-mise-by-language-4-java-and-gradle/) | [`lang/java`](lang/java) |
| 5 | [Rust and cargo](https://hobbyworker.me/en/dev/2026-10-28-mise-by-language-5-rust-and-cargo/) | [`lang/rust`](lang/rust) |
| 6 | [Hugo and Go](https://hobbyworker.me/en/dev/2026-10-29-mise-by-language-6-hugo-and-go/) | [`lang/hugo`](lang/hugo) |

The posts are published one per day from 2026-10-18 to 2026-10-29.

## Requirements

- mise 2026.10.11 or later. Install it with `curl -fsSL https://mise.run | sh`.
- Every other tool is installed by mise from each folder's `mise.toml` (`mise install`).

Last checked on 2026-10-17 with mise 2026.10.11 on macOS (Apple Silicon) and in Ubuntu 24.04 containers. The CI workflow runs the `guide/` examples, runs `mise run ci` in each `lang/` folder, and builds the Docker image.

## License

[MIT](LICENSE)

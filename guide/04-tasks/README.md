# 04-tasks

The project from [mise Guide (4): Running Tasks with mise run](https://hobbyworker.me/en/dev/2026-10-21-mise-guide-4-tasks/).

| Task | Defined in | What it does |
|---|---|---|
| `hello` | `mise.toml` | Prints `$GREETING` from `[env]` |
| `test` | `mise.toml` | Runs `node --test` |
| `build` | `mise.toml` | Copies `src/greet.js` to `dist/`, skipped while `sources` are older than `outputs` |
| `check` | `mise.toml` | Runs `test` and `build` |
| `greet` | `mise-tasks/greet` | A file task with a usage spec: `mise run greet [--upper] <name>` |

```bash
cd guide/04-tasks
mise tasks ls
mise run check
mise run greet --upper mise
```

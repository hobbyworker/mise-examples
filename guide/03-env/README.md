# 03-env

The files from [mise Guide (3): Per-Directory Environment Variables](https://hobbyworker.me/en/dev/2026-10-20-mise-guide-3-environment-variables/).

| File | Role |
|---|---|
| `mise.toml` | `[env]` values, a default, a required variable, and the `_.file`, `_.path`, `_.source` directives |
| `.env.example` | Copy to `.env`. Loaded by `_.file` |
| `mise.local.toml.example` | Copy to `mise.local.toml`. Sets the required `API_TOKEN` |
| `bin/hello` | Put on `PATH` by `_.path` |
| `scripts/env.sh` | Run by `_.source` |

`.env` and `mise.local.toml` are in `.gitignore`.

```bash
cd guide/03-env
cp .env.example .env
cp mise.local.toml.example mise.local.toml
cat mise.toml scripts/env.sh   # read before trusting
mise trust
mise exec -- hello
```

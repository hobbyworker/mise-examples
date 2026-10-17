# 05-version-files

The files from [mise Guide (5): Legacy Version Files and Lockfiles](https://hobbyworker.me/en/dev/2026-10-22-mise-guide-5-version-files-and-lockfile/).

| Folder | File | What mise does with it |
|---|---|---|
| `asdf-project` | `.tool-versions` | Read by default |
| `nvm-project` | `.nvmrc` | Read only after `mise settings add idiomatic_version_file_enable_tools node` |
| `locked` | `mise.toml`, `mise.lock` | `mise install --locked` installs the versions in `mise.lock` (macos-arm64, linux-x64, linux-arm64) |

```bash
cd guide/05-version-files/asdf-project && mise ls --current
cd ../nvm-project && mise settings add idiomatic_version_file_enable_tools node && mise install
cd ../locked && mise install --locked
```

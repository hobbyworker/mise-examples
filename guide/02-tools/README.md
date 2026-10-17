# 02-tools

The `mise.toml` from [mise Guide (2): Installing Tools and Switching Versions](https://hobbyworker.me/en/dev/2026-10-19-mise-guide-2-tools-and-versions/).

```bash
cd guide/02-tools
mise install
mise ls --current
mise exec -- rg --version
```

`node = "24"` and `ripgrep = "15"` are prefixes: mise picks the newest 24.x and 15.x, or an installed version that matches.

# lang/hugo

A small Hugo site with the FixIt theme from [mise by Language (6): Hugo and Go](https://hobbyworker.me/en/dev/2026-10-29-mise-by-language-6-hugo-and-go/). The theme comes in as a Hugo Module, so the site needs both Hugo (the extended edition, for the theme's SCSS) and Go.

```bash
cd lang/hugo
mise trust
mise install
mise run ci
mise run serve
```

`mise.toml` pins Hugo and defines the tasks. The Go version comes from the `go` line in `go.mod`, and `mise.toml` tells mise to read it there. The theme version is in `go.mod` and `go.sum`.

# 06-docker

The Docker example from [mise Guide (6): Using mise in GitHub Actions and Docker](https://hobbyworker.me/en/dev/2026-10-23-mise-guide-6-github-actions-and-docker/). The GitHub Actions example is [`.github/workflows/ci.yml`](../../.github/workflows/ci.yml).

The image builds on the official `ghcr.io/jdx/mise:2026.10.11-debian` image and installs the tools in `mise.lock` (linux-x64, linux-arm64, macos-arm64).

```bash
docker build -t mise-docker guide/06-docker
docker run --rm mise-docker
```

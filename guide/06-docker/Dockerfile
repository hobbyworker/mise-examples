FROM ghcr.io/jdx/mise:2026.10.11-debian

WORKDIR /app
COPY mise.toml mise.lock ./
RUN mise trust && mise install --locked
COPY . .
CMD ["mise", "run", "start"]

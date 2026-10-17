#!/usr/bin/env node
import { readFileSync } from "node:fs";
import { countWords, mostCommon } from "../src/wordcount.js";

for (const path of process.argv.slice(2)) {
  const counts = countWords(readFileSync(path, "utf8"));
  const total = [...counts.values()].reduce((a, b) => a + b, 0);
  console.log(`${path}: ${total} words`);
  for (const [word, n] of mostCommon(counts, 3)) {
    console.log(`  ${word.padEnd(8)} ${n}`);
  }
}

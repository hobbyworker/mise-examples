import { test } from "node:test";
import assert from "node:assert/strict";
import { countWords } from "../src/wordcount.js";

test("countWords ignores case and punctuation", () => {
  const counts = countWords("mise picks versions. Mise runs tasks!");
  assert.equal(counts.get("mise"), 2);
  assert.equal(counts.get("tasks"), 1);
  assert.equal(
    [...counts.values()].reduce((a, b) => a + b, 0),
    6,
  );
});

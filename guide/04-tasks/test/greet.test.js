const test = require("node:test");
const assert = require("node:assert");
const { greet } = require("../src/greet.js");

test("greet uses GREETING", () => {
  process.env.GREETING = "Hi";
  assert.strictEqual(greet("mise"), "Hi, mise!");
});

function greet(name) {
  return `${process.env.GREETING ?? "Hello"}, ${name}!`;
}

module.exports = { greet };

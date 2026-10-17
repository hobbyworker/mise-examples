const PUNCTUATION = /^[.,!?:;"'()]+|[.,!?:;"'()]+$/g;

export function countWords(text) {
  const counts = new Map();
  for (const raw of text.split(/\s+/)) {
    const word = raw.replace(PUNCTUATION, "").toLowerCase();
    if (word) counts.set(word, (counts.get(word) ?? 0) + 1);
  }
  return counts;
}

export function mostCommon(counts, n) {
  return [...counts].sort((a, b) => b[1] - a[1]).slice(0, n);
}

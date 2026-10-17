"""Count the words in text files."""

import sys
from collections import Counter

PUNCTUATION = ".,!?:;\"'()"


def count_words(text: str) -> Counter[str]:
    words = (w.strip(PUNCTUATION).lower() for w in text.split())
    return Counter(w for w in words if w)


def main() -> None:
    for path in sys.argv[1:]:
        with open(path, encoding="utf-8") as f:
            counts = count_words(f.read())
        print(f"{path}: {sum(counts.values())} words")
        for word, n in counts.most_common(3):
            print(f"  {word:<8} {n}")

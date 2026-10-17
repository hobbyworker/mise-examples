//! Count the words in text files.

use std::cmp::Reverse;

use indexmap::IndexMap;

const PUNCTUATION: &[char] = &['.', ',', '!', '?', ':', ';', '"', '\'', '(', ')'];

/// Counts each word, keeping the order in which words first appear.
pub fn count_words(text: &str) -> IndexMap<String, usize> {
    let mut counts = IndexMap::new();
    for raw in text.split_whitespace() {
        let word = raw.trim_matches(PUNCTUATION).to_lowercase();
        if !word.is_empty() {
            *counts.entry(word).or_insert(0) += 1;
        }
    }
    counts
}

/// The `n` most common words. Ties keep their first-appearance order.
pub fn most_common(counts: &IndexMap<String, usize>, n: usize) -> Vec<(&str, usize)> {
    let mut entries: Vec<(&str, usize)> = counts.iter().map(|(w, c)| (w.as_str(), *c)).collect();
    entries.sort_by_key(|&(_, count)| Reverse(count));
    entries.truncate(n);
    entries
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn count_words_ignores_case_and_punctuation() {
        let counts = count_words("mise picks versions. Mise runs tasks!");
        assert_eq!(counts["mise"], 2);
        assert_eq!(counts["tasks"], 1);
        assert_eq!(counts.values().sum::<usize>(), 6);
    }
}

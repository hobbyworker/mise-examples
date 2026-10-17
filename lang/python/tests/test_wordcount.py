from wordcount import count_words


def test_count_words_ignores_case_and_punctuation():
    counts = count_words("mise picks versions. Mise runs tasks!")
    assert counts["mise"] == 2
    assert counts["tasks"] == 1
    assert sum(counts.values()) == 6

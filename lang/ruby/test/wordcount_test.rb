# frozen_string_literal: true

require "minitest/autorun"
require_relative "../lib/wordcount"

class WordCountTest < Minitest::Test
  def test_count_words_ignores_case_and_punctuation
    counts = WordCount.count_words("mise picks versions. Mise runs tasks!")
    assert_equal 2, counts["mise"]
    assert_equal 1, counts["tasks"]
    assert_equal 6, counts.values.sum
  end
end

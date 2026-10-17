# frozen_string_literal: true

# Count the words in text files.
module WordCount
  PUNCTUATION = /\A[.,!?:;"'()]+|[.,!?:;"'()]+\z/

  def self.count_words(text)
    counts = Hash.new(0)
    text.split.each do |raw|
      word = raw.gsub(PUNCTUATION, "").downcase
      counts[word] += 1 unless word.empty?
    end
    counts
  end

  def self.most_common(counts, n)
    counts.each_with_index.sort_by { |(_, count), index| [-count, index] }.first(n).map(&:first)
  end
end

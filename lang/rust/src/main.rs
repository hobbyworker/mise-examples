use std::{env, fs, process};

use wordcount::{count_words, most_common};

fn main() {
    for path in env::args().skip(1) {
        let text = fs::read_to_string(&path).unwrap_or_else(|err| {
            eprintln!("{path}: {err}");
            process::exit(1);
        });
        let counts = count_words(&text);
        let total: usize = counts.values().sum();
        println!("{path}: {total} words");
        for (word, n) in most_common(&counts, 3) {
            println!("  {word:<8} {n}");
        }
    }
}

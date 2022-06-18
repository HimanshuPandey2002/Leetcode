class WordFilter {
    HashMap<String, Integer> map = new HashMap<>();
    
    public WordFilter(String[] words){
        int ind = 0;
        
        for(String word : words){
            int n = word.length();

            for(int i = 0; i <= 10 && i <= n; i++)
                for(int j = 0; j <= 10 && j <= n; j++)
                    map.put(word.substring(0,i) + "#" + word.substring(n - j), ind);
            ind++;
        }
    }

    public int f(String prefix, String suffix) {
        return (map.containsKey(prefix + "#" + suffix))? map.get(prefix + "#" + suffix) : -1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
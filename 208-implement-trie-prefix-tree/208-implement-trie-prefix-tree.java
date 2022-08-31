class Node {
    Node[] links = new Node[26];
    boolean flag = false;
    
    boolean contains(char c){
        return links[c - 'a'] != null;
    }
    
    void put(char c, Node node){
        links[c - 'a'] = node;
    }
    
    Node get(char c){
        return links[c - 'a'];
    }
    
    void setEnd(){
        flag = true;
    }
    
    boolean isEnd(){
        return flag;
    }
}


class Trie {
    private static Node root;
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        
        for(char c: word.toCharArray()){
            if(!node.contains(c))
                node.put(c, new Node());
            node = node.get(c);
        }
        
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node = root;
        
        for(char c: word.toCharArray()){
            if(!node.contains(c))
                return false;
            node = node.get(c);
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        
        for(char c: prefix.toCharArray()){
            if(!node.contains(c))
                return false;
            node = node.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class MyHashMap {
    ArrayList<Integer> keyList;
    ArrayList<Integer> valList;
    
    public MyHashMap() {
        keyList = new ArrayList<Integer>();
        valList = new ArrayList<Integer>();
    }
    
    public void put(int key, int value) {
        if(!keyList.contains(key)){
            keyList.add(key);
            valList.add(value);
        } else {
            int index = -1;
            
            for(int i = 0; i < keyList.size(); i++)
                if(keyList.get(i) == key)
                    index = i;
            
            valList.set(index, value);
        }
    }
    
    public int get(int key) {
        int index = -1;
            
        for(int i = 0; i < keyList.size(); i++)
            if(keyList.get(i) == key)
                index = i;  
        return (index != -1) ? valList.get(index) : -1;
    }
    
    public void remove(int key) {
        int index = -1;
        
        for(int i = 0; i < keyList.size(); i++)
            if(keyList.get(i) == key)
                index = i;
        if(index == -1) return;
        keyList.remove(index);
        valList.remove(index);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
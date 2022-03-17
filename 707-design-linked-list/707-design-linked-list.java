class MyLinkedList {
    class Node {
        int val;
        Node next;
        
        Node(){
            this.val = 0;
            this.next = null;
        }
        
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    private Node head;
    private int size;

    public MyLinkedList() {
        // Node n = new Node();
        // head = n;
    }
    
    
    public int get(int index) {
        if(index >= size || index < 0)
            return -1;
        Node n = head;
        for(int i = 0; i < index; i++)
            n = n.next;
        
        return n.val;
    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        size++;
        
        if(head == null){
            head = newNode;
            return ;
        }
        
        Node node = head;
        
        while(node.next != null)
            node = node.next;
        node.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return ;
        
        if(index == size){
            addAtTail(val);
            return ;
        }
        if(index == 0){
            addAtHead(val);
            return ;
        }
        size++;
        Node n = head;
        Node newNode = new Node(val);
        
        for(int i = 0; i < index-1; i++){
            n = n.next;
        }
        newNode.next = n.next;
        n.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0)
            return ;
        size--;
        Node n = head;
        if(index == 0){
            head = head.next;
            return ;
        }
            
        for(int i = 0; i < index-1; i++){
            n = n.next;
        }
        n.next = n.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
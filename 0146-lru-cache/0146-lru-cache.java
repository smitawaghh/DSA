class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private HashMap<Integer, Node> map = new HashMap<>();
        private int capacity;
        private Node head = new Node(-1, -1);
        private Node tail = new Node(-1, -1);
        


    public LRUCache(int capacity) {
        this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        deleteNode(node);
        insertAfterHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertAfterHead(node);
        }
        else {
            if (map.size() == capacity) {
                Node node = tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            insertAfterHead(node);
        }
    }

    public void deleteNode(Node node) {
        Node before = node.prev;
        Node After = node.next;
        before.next = After;
        After.prev = before;

    }
    public void insertAfterHead(Node node) {
        Node afthead = head.next;
        head.next = node;
        node.prev = head;
        node.next = afthead;
        afthead.prev = node;
        
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
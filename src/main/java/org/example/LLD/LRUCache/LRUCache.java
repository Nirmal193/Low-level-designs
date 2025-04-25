package org.example.LLD.LRUCache;

import java.security.Key;
import java.util.HashMap;
import java.util.Objects;

public class LRUCache<K,V> {
    private final int capacity;
    private final Node<K,V> head;
    private final Node<K,V> tail;
    private final HashMap<K,Node<K,V>> map;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.head = new Node<>(null,null);
        this.tail = new Node<>(null,null);
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    private void addToHead(Node<K,V> node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void removeNode(Node<K,V> node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public synchronized V get(K key){
        if(map.containsKey(key) == false){
            throw  new NullPointerException("Value not present in the cache");
        }
        Node<K,V> node = map.get(key);
        moveToHead(node);
        return node.value;
    }
    public void moveToHead(Node<K,V> node){
        removeNode(node);
        moveToHead(node);
    }
    public void add(K key,V value){
        Node<K,V> newNode= new Node(key,value);
        Node<K,V> node = map.get(key);
        if(Objects.nonNull(node)){
            map.put(key,newNode);
            moveToHead(newNode);
        }else{
            map.put(key,newNode);
            addToHead(newNode);
            if(map.size() > capacity){
                Node<K,V> lastNode = removeTail();
                map.remove(lastNode.key);
            }
        }
    }
    public Node removeTail(){
        Node<K,V> last = tail.prev;
        removeNode(last);
        return last;
    }
}

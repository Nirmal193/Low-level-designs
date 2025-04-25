package org.example.LLD.LRUCache;

public class LRUDriver {
    public static void main(String[] args) {
        LRUCache<Integer,Integer> cache = new LRUCache<>(2);
        cache.add(1,10);
        cache.add(2,20);
        cache.add(3,30);
        System.out.println(cache.get(1));
    }
}

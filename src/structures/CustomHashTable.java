package structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashTable<K, V> {
    // LinkedList to handle collisions (chaining)

    public class Entry {

        public K key;
        public V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

// Default table size
    private static final int SIZE = 16;

// Table: array of LinkedLists of Entries
    private final LinkedList<Entry>[] table;

// Constructor
    public CustomHashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash Function
    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Put key-value into the hash table
    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry(key, value));
    }

// Get value by key
    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    // Remove entry by key
    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Entry> bucket = table[index];

        bucket.removeIf(entry -> entry.key.equals(key));
    }

    // Check if key exists
    public boolean containsKey(K key) {
        int index = getIndex(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Entry> getBucket(int index) {
        return table[index];
    } //And change the Entry class to public

    public List<V> getAllValues() {
        List<V> values = new ArrayList<>();
        for (LinkedList<Entry> bucket : table) {
            if (bucket != null) {
                for (Entry entry : bucket) {
                    values.add(entry.value);
                }
            }
        }
        return values;
    }
}

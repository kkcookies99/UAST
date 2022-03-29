 class Solution {
    public String XXX(String[] strs) {
        Trie trie = new Trie();
        for(String s : strs) {
            if(s.equals("")) {
                return "";
            }
            trie.add(s);
        }
        return trie.comPrefix();
    }
}

class Trie {
    Node root;
    Trie() {
        root = new Node();
    }

    void add(String word) {
        Node cur = root;
        for(char c : word.toCharArray()) {
            if(cur.next.get(c) == null) {
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }
        cur.isWord = true;
    }

    String comPrefix() {
        Node cur = root;
        StringBuilder str = new StringBuilder("");
        while(cur.next.size() == 1) {
            Character c = (Character) cur.next.keySet().toArray()[0];
            str.append(c);
            if(cur.next.get(c).isWord){
                break;
            }
            cur = cur.next.get(c);
        }
        return str.toString();
    }

    class Node {

        boolean isWord = false;
        Map<Character, Node> next = null;
        Node() {
            next = new HashMap<>(); 
        }
    }
}


 class Solution {
    public int XXX(String s) {
        int len = s.length(), result = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (queue.contains(s.charAt(i))) {
                result = Math.max(result, queue.size());
                while (queue.poll() != s.charAt(i)) ;
            }
            queue.offer(s.charAt(i));
        }
        return Math.max(result, queue.size());
    }
}


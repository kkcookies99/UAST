 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        Node node = new Node(Integer.MAX_VALUE, len);
        Stack<Node> stack = new Stack<>();
        boolean[] visited = new boolean[len];
        stack.push(node);
        boolean flag = true;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            if (stack.size() == len + 1) {
                res.add(new ArrayList<>(list));
            }
            Node cur = stack.pop();
            flag = true;
            for (int i = 0; i < len; i++) {
                if (!visited[i] && cur.nexts[i] != -1) {
                    stack.push(cur);
                    stack.push(new Node(i, len));
                    visited[i] = true;
                    cur.nexts[i] = -1;
                    list.add(nums[i]);
                    flag = false;
                    break;
                }
            }
            if (flag && cur.index != Integer.MAX_VALUE) {
                visited[cur.index] = false;
                list.remove(new Integer(nums[cur.index]));
            }
        }
        return res;
    }
}

class Node {
    public int index;
    public int[] nexts;

    public Node(int value, int len) {
        this.index = value;
        nexts = new int[len];
    }
}


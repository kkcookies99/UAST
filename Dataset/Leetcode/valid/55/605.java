 class Solution {
    public boolean XXX(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int p = 0; p < size; p++) {
                int index = queue.poll();
                if (index == nums.length - 1) {
                    return true;
                }
                int maxJmpDis = nums[index];
                int d = 1;
                while (d <= maxJmpDis && index + d <= nums.length - 1) {
                    if (!visited[index + d]) {
                        queue.offer(index + d);
                        visited[index + d] = true;
                    }
                    d += 1;
                }
            }
        }
        return false;
    }
}


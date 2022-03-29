    public boolean XXX(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited.add(0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int index = queue.poll();
                for (int newIndex = 1 + index; newIndex <= nums[index] + index && newIndex < nums.length; newIndex++) {
                    if (newIndex == nums.length - 1) { // 加上這一行，提前退出
                        return true;
                    }
                    if (!visited.contains(newIndex)) {
                        visited.add(newIndex);
                        queue.add(newIndex);
                    }
                }
            }
        }
        return visited.contains(nums.length - 1);
    }


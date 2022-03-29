 public int singleNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    set.remove(num);
                }
            }
            return set.iterator().next();
        }

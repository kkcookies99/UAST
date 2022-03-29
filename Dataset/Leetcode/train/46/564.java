 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> out = new ArrayList<>();
        for (int i : nums){
            out.add(i);
        }

        setNext(lists, new ArrayList<>(), out);

        return lists;
    }

    public static void setNext(List<List<Integer>> all ,List<Integer> in,List<Integer> out){
        if (out.size() == 0){
            all.add(in);
            return;
        }

        for (Integer next : out) {
            List<Integer> out2 = new ArrayList<>(out);
            List<Integer> in2 = new ArrayList<>(in);
            out2.remove(next);
            in2.add(next);
            setNext(all, in2, out2);
        }
    }
}


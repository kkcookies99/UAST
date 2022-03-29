class Solution {
    private List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        get(nums,"", nums.length);
        Stream<List<Integer>> stream = list.stream().filter(list -> list.stream().distinct().collect(Collectors.toList()).size() == list.size());
        return stream.collect(Collectors.toList());
    }

    public void get(int[] nums,String cur,int length){
        if (cur.split(" ").length > length){
            return;
        }
        if (cur.length()!= 0 && cur.split(" ").length == length){
            ADD(cur);
        }
        for (int i = 0; i < nums.length; i++) {
            get(nums,cur+nums[i]+" ",length);
        }
    }

    public void ADD(String cur){
        String[] split = cur.split(" ");
        List<Integer> l = new ArrayList<>();
        for (String s : split) {
            l.add(Integer.parseInt(s));
        }
        list.add(l);
    }
}


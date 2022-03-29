 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        if(len <= 0) return Collections.EMPTY_LIST;

        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        Queue<List<Integer>> que = new ArrayDeque<>();
        que.add(list);
        while(!que.isEmpty()){
            list = que.peek();
            if(list.size() >= len) break;
            que.remove();
            que.addAll(helper(list, nums[list.size()]));
        }

        return new ArrayList<>(que);
    }

    public List<List<Integer>> helper(List<Integer> src, int num){
        List<List<Integer>> res = new ArrayList<>();
        int len = src.size();
        for(int i = 0; i <= len; i++){
            List<Integer> newList = new ArrayList<>(src);
            newList.add(i, num);
            res.add(newList);
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



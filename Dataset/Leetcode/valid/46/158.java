class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        tree(result,list,nums);
        return result;
    }
    public void tree(List<List<Integer>> result,List<Integer> list,int[] arr){
        if (list.size() == arr.length){
            ArrayList<Integer> temp = new ArrayList<>(list);
            result.add(temp);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
                tree(result,list,arr);
                list.remove(list.size() - 1);
            }
        }
    }
}


class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        help(result,nums,0);
        return result;
    }

    public void help(List<List<Integer>> result,int[] nums,int index){
        if (index >= nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums,index,i);
            help(result,nums,index+1);
            swap(nums,index,i);
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



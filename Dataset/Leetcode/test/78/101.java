class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();
        backtrace(result,elements,nums,0);
        return result;
    }

    public void backtrace(List<List<Integer>> result,List<Integer> elements,int[] nums,int length){
        if(length==nums.length){
            List<Integer> elementsClone = new ArrayList<>();
            elementsClone.addAll(elements);
            result.add(elementsClone);
            return;
        }
        backtrace(result,elements,nums,length+1);
        elements.add(nums[length]);
        backtrace(result,elements,nums,length+1);
        elements.remove(new Integer(nums[length]));
    }
}


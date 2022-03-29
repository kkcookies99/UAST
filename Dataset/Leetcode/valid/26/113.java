 class Solution {
    public int XXX(int[] nums) {
        // 思路： idx是有效值下标，失踪小于使用下标
        // 由前到后遍历，不存在SET的就作为有效，并填入set
        int idx = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                nums[idx++] = i;
                set.add(i);
            }
        }

        return idx;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


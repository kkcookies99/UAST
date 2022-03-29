 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            int j = 0;
            do {
                if (j == i) {
                    j++;
                    continue;
                }
                if (nums[j] == temp){
                    result[0] = j;
                    result[1] = i;
                    break;
                }
                j ++;
            }while(j < nums.length);
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



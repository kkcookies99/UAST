 class Solution {
    public void XXX(int[] nums) {
        int[] counter = new int[3];
        for (int num : nums) {
            counter[num]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < counter[i]; j++) {
                nums[index++] = i;
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



class Solution {
    public void XXX(int[] nums) {
        int pivot = 1;
        int less =-1;
        int more =nums.length;
        int index=0;

        while(index<more){
            if(nums[index]==pivot){
                index++;
            }else if(nums[index]<pivot){
                swap(nums, less+1, index);
                less++;
                index++;
            }else{
                swap(nums,--more, index);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



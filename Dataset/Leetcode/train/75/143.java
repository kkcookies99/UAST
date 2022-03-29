public void XXX(int[] nums) {
        if(nums.length < 2){
            return;
        }
        int zero = -1;  //nums[0...zero] == 0
        int two = nums.length;  //nums[two...n-1] == 2
        for (int i = 0; i < two; ) {
            if(nums[i] == 1){
                i++;
            }else if(i < two && nums[i] == 2){
                two--;
                swap(nums, i, two);
            }else{
                zero++;
                swap(nums, zero, i);
                i++;
            }
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



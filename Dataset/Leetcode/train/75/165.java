class Solution {
    public void XXX(int[] nums) {
        /*
        将数组分割成三部分
        遍历数组，如果是0放在前面，如果是2放在后面，中间的就是1
        */
        int l = 0, r = nums.length - 1;

        for(int i = 0; i <= r; i++){
            if(nums[i] == 0){
                if(i != l){
                    //交换l和i处的值
                    int tmp = nums[i];
                    nums[i] = nums[l];
                    nums[l] = tmp;    
                }
                //确保所有0都在下标0到l之间
                l++;                
            }else if(nums[i] == 2){
                //交换r和i处的值
                if(i != r){
                    int tmp = nums[i];
                    nums[i] = nums[r];
                    nums[r] = tmp; 
                    //交换完需要再次判断i处的值
                    i--;
                }
                //确保所有2都在下标r到n之间
                r--;
            }
        }


    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



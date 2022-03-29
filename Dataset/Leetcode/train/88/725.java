 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        quick_sort(nums1,0,m+n-1);
    }
    public void quick_sort(int[] nums,int l,int r){
        if(l<r){
            int temp,lowkey,highkey,n;
            int signal=0,trans=0;
            n = nums.length;
            lowkey = l;
            highkey = r;
            temp = nums[lowkey];
            while(lowkey!=highkey){
                if(signal==0){
                    if(nums[highkey]<=temp){
                        nums[lowkey] = nums[highkey];
                        lowkey++;
                        trans = 1;
                    }
                    else highkey--;
                }
                if(signal==1){
                    if(nums[lowkey]>=temp){
                        nums[highkey] = nums[lowkey];
                        highkey--;
                        trans = 0;
                    }
                    else lowkey++;
                }
                if(trans==1) signal = 1;
                else signal = 0;
            }
            nums[lowkey] = temp;
            quick_sort(nums,l,lowkey-1);
            quick_sort(nums,lowkey+1,r);
        }
    }
}


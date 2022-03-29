 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        // num1中没有需要比较的数字，就把num2放到num1中。
        if(i<0){
            for(int p=0; p<n; p++){
                nums1[p] = nums2[p];
            }
        }
        while(i>=0 && j>=0){
            // nums2访问完了此时i就跟k相等了。
            if(i==k){
                break;
            }
            if(nums1[i]>=nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        // num1已经访问完了, 但是num2还有。
        if(i<0 && j>=0){
            for(int p=0; p<=j; p++){
                nums1[p] = nums2[p];
            }
        }
        
        
    }


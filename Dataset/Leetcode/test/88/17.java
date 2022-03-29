 public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<nums1.length && j<nums2.length){
            // nums1中的数字小
            if(nums1[i]<=nums2[j]&&count<m){
                i++;
                count++;
                if(count == m){
                    for(int k=j;k<nums2.length;k++){
                        nums1[i+k-j] = nums2[k];
                    }
                    break;
                }
            }else{
                // nums2的数字小
                for(int k=nums1.length-2; k>=i; k--){
                    nums1[k+1] = nums1[k];
                }
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }

    }


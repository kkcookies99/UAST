     public void XXX(int[] nums1, int m, int[] nums2, int n) {
        
        
        int[] temp = new int[n + m];
        int i = 0 , j =0 , k = 0;
        while( i < m || j < n ){
            if(i >= m){
                temp[k++] = nums2[j++];
                continue;
            }
            if(j >= n){ 
                temp[k++] = nums1[i++];
                continue;
            }
            if(nums1[i] <= nums2[j]){
                temp[k++] = nums1[i++];
            }else{
                temp[k++] = nums2[j++];
            }
        }

        for(int x = 0 ; x < m + n ; x++){
            nums1[x] = temp[x];
        }

    }


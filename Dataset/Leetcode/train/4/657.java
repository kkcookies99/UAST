 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int m =nums1.length;
        int n =nums2.length;
        int mid = (m+n-1)/2;
        //左右数组指针
        int i=0,j=0;
        //最中间的数，或者最中间两个数;
        double temp = 0,temp1 = 0;
        //当前指针
        int index = 0;
        while(i<m && j<n && index<mid+2){
            if(nums1[i]<=nums2[j]){
                if(index == mid)
                  temp = nums1[i];
                if(index == mid+1)
                  temp1 = nums1[i];  
                i++;
            }else{
                if(index == mid)
                  temp = nums2[j];
                if(index == mid+1)
                  temp1 = nums2[j];  
                j++;
            }
            
            index++;
        }

        while(i<m && index<mid+2){
            if(index == mid)
                  temp = nums1[i];
            if(index == mid+1)
                  temp1 = nums1[i];      
            i++;
            index++;
        }
        while(j<n && index<mid+2){
            if(index == mid)
                  temp = nums2[j];
            if(index == mid+1)
                  temp1 = nums2[j];
            j++;
            index++;
        }

        if((m+n)%2==0){
            return (temp+temp1)/2;
        }else{
            return temp;
        }

    }
}


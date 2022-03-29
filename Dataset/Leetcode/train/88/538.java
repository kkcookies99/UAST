 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i+m] = nums2[i];
        }
        quick_sort(nums1,0,nums1.length-1);
        
        
    }
     void  quick_sort(int s[], int l, int r)
    {
    if (l < r)
    {
        int i = l, j = r, x = s[l];
        while (i < j)
        {
            while(i < j && s[j] >= x) 
                j--;  
            if(i < j) 
                s[i++] = s[j];
            while(i < j && s[i] < x) 
                i++;  
            if(i < j) 
                s[j--] = s[i];
        }
        s[i] = x;
        quick_sort(s, l, i - 1); 
        quick_sort(s, i + 1, r);
    }
    }
}


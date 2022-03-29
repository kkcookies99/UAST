 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n==0){
            return;
        }else if(m==0){
            for(m;m<n;++m){
                nums1[m]=nums2[m];
            }
        }else{
            int index=m+n-1;
            m=m-1,n=n-1;

            while(index>=0){
                if(nums1[m]>=nums2[n]){
                    nums1[index]=nums1[m];
                    m--;index--;

                    if(m<0){
                        for(index;index>=0;--index){
                            nums1[index]=nums2[index];
                        }
                    }
                }else{
                    nums1[index]=nums2[n];
                    n--;index--;

                    if(n<0){
                        return;
                    }
                }
            }
        }
    }
};


 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int length= m+n ;
        int bp=0;
        
        for(int i=0;i<length;i++){
            if (m==0) {
                nums1=nums2;
                break;}
            if (n==0) {
                break;}

            if (nums1[i]>=nums2[bp] && i<m){
                int cup=nums1[i];
                nums1[i]=nums2[bp];
                nums2[bp]=cup;
                for(int a=0;a<n-1;a++){
                        if (cup>nums2[a+1]){
                            nums2[a]=nums2[a+1];
                            nums2[a+1]=cup;
                        }
                    }
            }
            else if(i>=m){
                nums1[i]=nums2[bp];
                bp++;
            }
            
            }
    }
code block


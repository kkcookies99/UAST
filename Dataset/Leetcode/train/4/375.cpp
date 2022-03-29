 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int i=nums1.size()+nums2.size();
        int a=0,b=0;
        int res1=0,res2=0;
        while(a<nums1.size()&&b<nums2.size()&&(a+b)<=i/2){
            if(nums1[a]<nums2[b]){
                res2=res1;
                res1=nums1[a++];
            }else{
                res2=res1;
                res1=nums2[b++];
            }
        }
        if(a==nums1.size()){
            while((a+b)<=i/2){
                res2=res1;
                res1=nums2[b++];
            }
        }else if(b==nums2.size()){
            while((a+b)<=i/2){
                res2=res1;
                res1=nums1[a++];
            }
        }
        if(i%2==1)
            return (double)res1;
        else
            return (double)(res1+res2)/2;
            
    }
};


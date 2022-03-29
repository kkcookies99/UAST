 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int a = nums1.size(),b=nums2.size();
        if(a < b)
            swap(nums1,nums2);            
        for(int i= 0;i < nums2.size();i++)
        {
            nums1.push_back(nums2[i]);
        }
        sort(nums1.begin(),nums1.end());
         double result;
        if(nums1.size() % 2 == 1)
            result = nums1[(nums1.size()+1)/2 - 1];
        else
            result = (nums1[(nums1.size()/2) -1] +  nums1[(nums1.size()/2)]) / 2.0;
 
        return result;
         
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



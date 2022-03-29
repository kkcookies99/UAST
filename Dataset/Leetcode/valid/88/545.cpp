 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(nums1.size()==n) {nums1=nums2;return ;}
        int end=nums1.size()-1;
        m--;
        n--;
        while(n>=0)
        {
            if(m<0||nums1[m]<=nums2[n])
                nums1[end--]=nums2[n--];
            else nums1[end--]=nums1[m--];
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



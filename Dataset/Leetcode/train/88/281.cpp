 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int s1=0,s2=0;
        while(n>0)
        {
            while(nums2[s2]>=nums1[s1]&&s1<m)s1++;
            int last=m;
            while(last>s1)nums1[last]=nums1[last-1],last--;
            nums1[s1]=nums2[s2];
            n--,s1++,m++,s2++;
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



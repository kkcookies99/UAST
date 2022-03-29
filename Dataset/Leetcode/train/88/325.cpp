 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=m-1;i>=0;i--)
            nums1[i+n]=nums1[i];
        int index=0,i=n,j=0;
        while(index!=m+n){
            if((i!=m+n&&j!=n&&nums1[i]>=nums2[j])||(j!=n&&i==m+n)){
                nums1[index]=nums2[j];
                j++;
            }
            else if((i!=m+n&&j!=n&&nums1[i]<nums2[j])||(j==n&&i!=m+n)){
                nums1[index]=nums1[i];
                i++;
            }
            index++;
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



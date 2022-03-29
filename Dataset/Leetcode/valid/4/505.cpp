 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int tol=nums1.size()+nums2.size();
        if(tol%2==0){
            return (find(nums1,0,nums2,0,tol/2)+find(nums1,0,nums2,0,tol/2+1))/2.0;
        }
        else return find(nums1,0,nums2,0,tol/2+1);
    }
    int find(vector<int> & nums1,int i,vector<int>& nums2,int j,int k){
        if(nums1.size()-i>nums2.size()-j) return find(nums2,j,nums1,i,k);
        if(nums1.size()<=i) return nums2[j+k-1];
        if(k==1) return min(nums1[i],nums2[j]);
        int si=min((int)nums1.size(),i+k/2),sj=j+k/2;
        if(nums1[si-1]<nums2[sj-1]){
            return find(nums1,si,nums2,j,k-(si-i));
        }
        else {
            return find(nums1,i,nums2,sj,k-(sj-j));
        }

    }
};


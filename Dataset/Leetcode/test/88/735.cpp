 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=0;i<nums2.size();i++){
            nums1[m+i] = nums2[i];
        }
        //复制
        // int pt1=0;
        int pt2=m;
        for(int i=0; i<m&&pt2<nums1.size();i++){
            if(nums1[i]>nums1[pt2]){
                int tmp = nums1[i];
                nums1[i]=nums1[pt2];
                nums1[pt2]=tmp;
                
                int tmp_index = pt2;
                while(tmp_index+1<nums1.size() && nums1[tmp_index]>nums1[tmp_index+1]){
                    swap(nums1[tmp_index],nums1[tmp_index+1]);
                    tmp_index++;
                }
            //
            }
        }
    }
};


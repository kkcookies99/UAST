 class Solution {
public:
    int getKth(vector<int>& nums1, vector<int>& nums2,int k){
        auto p1=nums1.begin(),p2=nums2.begin();
        while(p1!=nums1.end()||p2!=nums2.end()){
            if(p1!=nums1.end()&&p2!=nums2.end()){
                if(k==1)
                    return (*p1<*p2)?*p1:*p2;
                int w1,w2;
                w1=((nums1.end()-p1-1)<(k/2-1))?(nums1.end()-p1-1):(k/2-1);
                w2=((nums2.end()-p2-1)<(k/2-1))?(nums2.end()-p2-1):(k/2-1);
                if(*(p1+w1)<*(p2+w2)){
                    p1=p1+w1+1;
                    k-=(w1+1);
                }
                else{
                    p2=p2+w2+1;
                    k-=(w2+1);
                }
            }
            else if(p1!=nums1.end()){
                return *(p1+k-1);
            }
            else if(p2!=nums2.end()){
                return *(p2+k-1);
            }
        }
        return 0;
    }
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int n=nums1.size()+nums2.size();
        double mid=0;
        if (n%2){
            mid=getKth(nums1,nums2,n/2+1);
        }
        else{
            mid=double(getKth(nums1,nums2,n/2+1)+getKth(nums1,nums2,n/2))/2;
        }
        return mid;
    }
};


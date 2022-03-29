 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int p1=0,p2=0;
        int n1=nums1.size(),n2=nums2.size();
        long s=n1+n2;
        int k1,k2;
        double sum=0;
        bool key=false;
        if(s&1)k1=k2=s/2;
        else k1=s/2-1,k2=k1+1;
        while(p1!=n1&&p2!=n2){
            if(p1+p2<k1){
                if(nums1[p1]<nums2[p2])p1++;
                else p2++;
            }
            else{
                if(k1==k2){
                    sum=min(nums1[p1],nums2[p2]);
                    key=true;
                    break;
                }
                else{
                    if(p1+p2==k1){
                        sum+=min(nums1[p1],nums2[p2]);
                        if(nums1[p1]<nums2[p2])p1++;
                        else p2++;
                    }
                    else{
                        sum+=min(nums1[p1],nums2[p2]);
                        key=true;
                        break;
                    }
                }
            }
        }
        if(key)return k1==k2?sum:sum/2;
        while(p1==n1){
            if(k1==k2){
                if(p1+p2==k1){
                    sum=nums2[p2];
                    break;
                }
                else p2++;
            }
            else{
                if(p1+p2==k1)sum+=nums2[p2++];
                else if(p1+p2==k2){
                    sum+=nums2[p2];
                    break;
                }
                else p2++;
            }
        }
        while(p2==n2){
            if(k1==k2){
                if(p1+p2==k1){
                    sum=nums1[p1];
                    break;
                }
                else p1++;
            }
            else{
                if(p1+p2==k1)sum+=nums1[p1++];
                else if(p1+p2==k2){
                    sum+=nums1[p1];
                    break;
                }
                else p1++;
            }
        }
        return k1==k2?sum:sum/2;
    }
};


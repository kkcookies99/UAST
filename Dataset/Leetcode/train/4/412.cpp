 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
    vector<int> res;
    for(int i=0;i<nums1.size();i++){
        res.push_back(nums1[i]);
    }
    for(int i=0;i<nums2.size();i++){
        res.push_back(nums2[i]);
    }
    sort(res.begin(),res.end());
    if(res.size()%2==0){
        cout<<res[res.size()/2]<<" "<<res[res.size()/2-1]<<endl;
        return (res[res.size()/2]+res[res.size()/2-1])*1.0/2;
    }
    else{
        return res[res.size()/2];
    }
}
};

 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int>::iterator it1,it2;
        vector<double> r;
        double re;
        it1=nums1.begin();
        it2=nums2.begin();
        while(it1!=nums1.end()||it2!=nums2.end())
            {
                if(it1!=nums1.end()&&it2!=nums2.end()&&*it1>*it2)
                {
                    r.push_back(*it2);
                    it2++;
                } 
            else if(it1!=nums1.end()&&it2!=nums2.end()&&*it1<=*it2)
            {
                r.push_back(*it1);
                    it1++;
            }
            else if(it1==nums1.end()&&it2!=nums2.end()){
                r.push_back(*it2);
                it2++;
            }
             else if(it1!=nums1.end()&&it2==nums2.end()){
                r.push_back(*it1);
                it1++;
            }
            }
        if(r.size()%2==0)
        {
            re =( r[r.size()/2]+ r[r.size()/2-1])/2;
            return re;
        }
        else
        {
             re =r[r.size()/2];
                  return re;
        }
        
    }
};


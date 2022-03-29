 class Solution {
public:
    vector<vector<int> > XXX(vector<vector<int> > &intervals)
    {
        sort(intervals.begin(),intervals.end(),[](vector<int>a,vector<int>b){
            return a[0]<b[0];
        });
        int start = -1;
        int end=-1;
        int one=-1;
        int two=-1;
        int firstFlag=-1;
        vector<vector<int> >res;
        for(int i=0;i<intervals.size();i++){
            vector<int>temV=intervals[i];
             one=temV[0];
             two=temV[1];
            if(firstFlag<0){
                start=one;
                end=two;
                firstFlag=1;
                continue;
            }
            if(one>=start&&one<=end){
                start=min({start,end,one,two});
                end=max({start,end,one,two});
            }if(one>end){
                res.push_back({start,end});
                start=one;
                end=two;
            }
        }
        res.push_back({start,end});
        return res;
    }
};


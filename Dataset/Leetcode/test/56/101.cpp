class Solution {
public:
static bool cmp(const vector<int>&a,const vector<int>&b){
       if(a[0]==b[0])return a[1]<b[1];
       return a[0]<b[0];
}
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
     vector<vector<int>>res;
     //按开始位置排序
     sort(intervals.begin(),intervals.end(),cmp);
     int i=0;
     while(i<intervals.size()){
      int xstart=intervals[i][0];
      int xend=intervals[i][1];
      while(i<intervals.size()&&intervals[i][0]<=xend){
          xend=max(intervals[i][1],xend);
          i++;
      }
      res.push_back(vector<int>{xstart,xend});
     }
     return res;
    }
};


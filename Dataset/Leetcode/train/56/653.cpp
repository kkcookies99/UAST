 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals)
     {
         vector<vector<int>> V;
         sort(intervals.begin(), intervals.end());
         for(int i = 0; i < intervals.size(); i++)
         {
             int min = intervals[i][0];
             int max1 = intervals[i][1];
             while( i < intervals.size()-1 &&  (min <= intervals[i+1][0] && intervals[i+1][0]<= max1))
             {
                 max1=max(max1,intervals[i+1][1]);
                 i++;
             }
              V.push_back({min,max1});
         }
         return V;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



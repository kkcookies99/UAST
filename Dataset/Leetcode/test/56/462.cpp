 class Solution {
public:

    void itor(vector<vector<int>>&temp, vector<vector<int>>&intervals, bool& flag2)
    {

            if(flag2)
            return;
          for(int i = 1; i< intervals.size();i++)
        {
            int a = intervals[i][0];
            int b = intervals[i][1];
            bool flag = false;

            for(int j = 0; j< temp.size(); j++)
            {
                int c = temp[j][0];
                int d = temp[j][1];
                if(a<=d&&b>=c)
                {
                    if(a<=c)
                    temp[j][0] = a;
                    if(b>d)
                    temp[j][1] = b;
                    flag = true;
                    break;
                }
            }
            if(!flag)
            temp.push_back(intervals[i]);
        }
           if(intervals.size()== temp.size())
            flag2 = true;
            if(flag2)
            return;
            intervals = temp;
            temp.clear();
            temp.push_back(intervals[0]);
            itor(temp, intervals, flag2);
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {

        vector<vector<int>>temp;
        temp.push_back(intervals[0]);
        bool flag2 = false;
        itor(temp, intervals, flag2);

        
   return temp;
    }
};


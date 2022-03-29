 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        priority_queue<double, vector<double>, greater<double>> q;
        for(auto i: intervals) {
            q.push(i[0]);
            q.push(i[1]+0.1);
        }
        
        int count = 0;
        int start = 0;
        while(!q.empty()) {
            double top = q.top();
            if((int)top == top) {
                if(count == 0) {
                    start = top;
                }
                count++;
            }else {
                count--;
                if(count == 0) {
                    vector<int> v;
                    v.push_back(start);
                    v.push_back(top);
                    result.push_back(v);
                }
            }
            q.pop();
        }

        return result;
    }
};


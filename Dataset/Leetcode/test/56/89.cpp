class Solution {
public:
    vector<Interval> XXX(vector<Interval>& A) {
        vector<Interval> res;
        if(A.size() <= 1) return A;
        sort(A.begin(), A.end(), [](Interval x, Interval y){ return x.start < y.start; });
        int i = 0;
        Interval tmp = A[0];
        while(i < A.size()){
            if(i + 1 < A.size() && tmp.end >= A[i+1].start){
                if(tmp.end < A[i+1].end){
                    tmp.end = A[i+1].end;
                }
                //cout << i << endl;
            }else{
                res.push_back(tmp);
                tmp = A[i+1];
            }
            ++i;
        }
        return res;
    }
};


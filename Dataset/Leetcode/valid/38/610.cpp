 class Solution {
public:
    string XXX(int n) {
        string s = "1";
        vector<pair<int,char>> v;
        for(int i=1; i<n; i++){
            v.push_back(pair<int,char>(1,s[0]));
            for(int j=1,k=0; j<s.length(); j++){
                if(s[j] == v[k].second)
                    v[k].first++;
                else{
                    v.push_back(pair<int,char>(1,s[j]));
                    k++;
                }
            }
            s.clear();
            for(int j=0; j<v.size(); j++){
                s += to_string(v[j].first);
                s += v[j].second;
            }
            v.clear();
        }
        return s;
    }
};


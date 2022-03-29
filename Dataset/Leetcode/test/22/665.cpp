 class Solution {
public:
    vector<string> XXX(int n) {
        vector<unordered_set<string>> vec_str(++n);
        vec_str.at(0).insert("");
        vec_str.at(1).insert("()");
        if(n==0)return {};
        if(n==1)return {"()"};
        for(int i=2;i<n;++i)
            for(int j=0;j<i;++j)
                for(auto it1=vec_str.at(j).begin();it1!=vec_str.at(j).end();++it1)
                    for(auto it2=vec_str.at(i-j-1).begin();it2!=vec_str.at(i-j-1).end();++it2)
                        vec_str.at(i).insert("("+*it1+")"+*it2);
        vector<string> vec(vec_str.at(n-1).begin(),vec_str.at(n-1).end());
        return vec;
    }
};


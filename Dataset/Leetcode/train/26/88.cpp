 int XXX(vector<int>& vec) {
        /*set<int> ump;
        for(int i = 0;i < nums.size();i ++){
            if(ump.count(nums[i])){
                continue;
            }
            ump.insert(nums[i]);
        }
        nums.clear();
        for(auto i : ump){
            nums.push_back(i);
        }
        return ump.size();*/
        set<int> st(vec.begin(), vec.end());
        vec.assign(st.begin(), st.end());
        return vec.size();
    }


 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> path;
        traceback(result,path,nums);
        return result;
    }
    void traceback(vector<vector<int>>&result,vector<int> path,vector<int> choices){
        if (choices.size() == 1){
            path.push_back(choices.front());
            result.push_back(path);
            return;
        }
        for (int i=0; i<choices.size(); i++){
            int choice = choices[i];
            choices.erase(choices.begin()+i);
            path.push_back(choice);
            traceback(result,path,choices);
            choices.insert(choices.begin(),choice);
            path.pop_back();
        }

    }
};


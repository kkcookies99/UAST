 class Solution {
public:
    int all_n;
    vector<string> result;
    void generate(int push_num, int pop_num, string temp) {
        if(pop_num > push_num) return;
        if(push_num > all_n) return;
        if(push_num == all_n && pop_num == all_n) result.emplace_back(temp);
        generate(push_num + 1, pop_num    , temp + "(");
        generate(push_num    , pop_num + 1, temp + ")");
    }
    vector<string> XXX(int n) {
        all_n = n;
        generate(1, 0, "(");
        generate(0, 1, ")");
        return result;
    }
};


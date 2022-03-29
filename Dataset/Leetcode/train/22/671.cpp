 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string>res;
        if(n==0)return res;
        dfs("",0,0,0,2*n,res);
        return res;
    }
    void dfs(string cur_str,int left_barcket_num,int right_bracket_num,int cur_pos,int len,vector<string>&res_set){
        if(cur_pos==len){
            res_set.push_back(cur_str);
            return;
        }
        if(left_barcket_num<len/2){
            dfs(cur_str+"(",left_barcket_num+1,right_bracket_num,cur_pos+1,len,res_set);
            if(right_bracket_num<left_barcket_num){
                dfs(cur_str+")",left_barcket_num,right_bracket_num+1,cur_pos+1,len,res_set);
            }
        }
        else{
            dfs(cur_str+")",left_barcket_num,right_bracket_num+1,cur_pos+1,len,res_set);
        }
    }
};


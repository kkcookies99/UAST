 class Solution {
public:

    void shengchengkuohao(int count_left,int count_right,vector<string>& res,string &temp){
        if(count_right==0&&count_left==0){
            res.push_back(temp);
            return;
        }else if(count_right<0||count_left<0){
            return;
        }else if(count_left>count_right){
            return;
        }
        
        count_left--;
        temp+="(";
        shengchengkuohao(count_left,count_right,res,temp);
        temp=temp.substr(0,temp.length()-1);
        count_left++;

        count_right--;
        temp+=")";
        shengchengkuohao(count_left,count_right,res,temp);
        temp=temp.substr(0,temp.length()-1);
        count_right++;

    }


    vector<string> XXX(int n) {
        vector<string> res;
        string temp;
        shengchengkuohao(n,n,res,temp);
        return res;
    }
};


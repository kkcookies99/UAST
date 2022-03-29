 class Solution {
public:
    string XXX(vector<string>& strs) {
        int k = strs[0].size()-1;    //k=前缀的最大下标
        for(int i=1;i<strs.size();i++){   //依次遍历每一个字符
            if(strs[i].size()-1<k){     //判断字符的最大下标是否小于k
                k = strs[i].size()-1;
            }
            for(int j=0;j<=k;j++){
                if(strs[i][j]!=strs[0][j]){    //将此字符与第一个字符比较
                    k = j - 1;
                    break;
                }
            }
        }
        string e;
        for(int i=0;i<=k;i++){
            e += strs[0][i];
        }
        return e;
    }
};


 class Solution {
public:
    string XXX(string s, int numRows) {//模拟
        vector<string> t(numRows);
        int n = s.size();
        int index = 0;
        int flag = 0;//用flag为0表示从上往下走，flag=1表示从下往右上走
        while (1){
            if (flag == 0){
                if (n - index <= numRows){
                    int a = n - index; 
                    for (int i = 0; i<a; i++){
                        t[i].push_back(s[index]);
                        ++index;
                    }
                    break;
                }
                else{
                    for (int i = 0; i<numRows; i++){
                        t[i].push_back(s[index]);
                        ++index;
                    }
                }
                flag = 1;//改变flag
            }
            else{
                if (n - index <= numRows - 2){
                    int a = n - index;
                    for (int i = numRows - 2; i >= numRows - a- 1; i--){
                        t[i].push_back(s[index]);
                        ++index;
                    }
                    break;
                }
                else{
                    for (int i = numRows - 2; i >= 1; i--){
                        t[i].push_back(s[index]);
                        ++index;
                    }
                }
                flag = 0;//执行完改变flag
            }
        }
        string ans = "";
        for (int i = 0; i<t.size(); i++){
            ans += t[i];
        }
        return ans;
    }
};


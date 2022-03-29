class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        int count = 1, sum = 2;
        string ans = "11", temp;
        while(sum != n)
        {
            for(int i=0; i < ans.size(); i++)
            {
                if(ans[i] == ans[i+1]){
                    count++;
                }
                else{
                    temp += to_string(count);
                    temp += ans[i];
                    count = 1;
                }
            }
            ans = temp;
            temp.clear();
            sum++;
        }

        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



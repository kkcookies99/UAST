 class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        string pre = XXX(n-1), res;
        int count = 0;
        for(int i = 0; i < pre.size(); i++)
        {
            count++;
            if(i+1 == pre.size() || pre[i] != pre[i + 1])
            {
                res += (count + '0');
                res += pre[i];
                count = 0;
            }
            
        }
        return res;
        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



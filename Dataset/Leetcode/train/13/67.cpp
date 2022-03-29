class Solution {
public:
    int XXX(string s) {
        int num[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        string temp[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int ans=0;
        for(int i=0;i<13;i++)
        {
            while(s.find(temp[i])==0)
            {
                ans+=num[i];
                s=s.substr(temp[i].length());
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


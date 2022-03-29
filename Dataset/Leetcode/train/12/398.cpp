 class Solution {
public:
    string XXX(int num) {
        string ans;
        string str=to_string(num);
        char a[4][2]={'I','V','X','L','C','D','M',' '};
        int n=str.length();
        int i=0;
        while(n--){
            int cur = str[i++]-'0';
            if(cur<=3){
                while(cur-->0){
                    ans+=a[n][0];
                }
            }
            else if(cur==4){
                ans+=a[n][0];
                ans+=a[n][1];
            }
            else if(cur<9){
                ans+=a[n][1];
                cur-=5;
                while(cur-->0){
                    ans+=a[n][0];
                }
            }else{
                ans+=a[n][0];
                ans+=a[n+1][0];
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



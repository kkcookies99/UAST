 class Solution {
public:
    string XXX(int n) {
    if(n==1) return "1";
    string pre="1";
    for(int i=1;i<n;i++){
        string temp;
        int start=0;
        int end=0;
        while(end<pre.size()){
            while(end<pre.size()&&pre[start]==pre[end]) {
                end++;
            }        
                temp+=to_string(end-start)+pre[start];
                start=end;
              }  
        pre=temp;      
    }
    return pre;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



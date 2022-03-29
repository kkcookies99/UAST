 class Solution {
public:
    int XXX(string haystack, string needle) {
        int i=0,j=0,newi=0,newj=0;
        if(needle.length()==0){
            return 0;
        }
        while(j<needle.length()&&i<haystack.length()){
            if(haystack[i]==needle[j]){
                i++;
                j++;
            }
            else{
                newi=newi+1;
                j=0;
                i=newi;
            }
        }
        if(j==needle.length()){
            return newi;
        }
        else{
            return -1;
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


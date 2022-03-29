 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        String[] strs=new String[numRows];
        for(int i=0;i<strs.length;i++)
            strs[i]="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int k=i%(numRows*2-2);
            if(k<numRows){
                strs[k]+=c;
            }
            else {
                strs[numRows*2-2-k]+=c;
            }
        }
        
        String result="";
        for(int i=0;i<numRows;i++){
            result+=strs[i];
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



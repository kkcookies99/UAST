 class Solution {
    public boolean XXX(String s) {
        char[] w=s.toCharArray();
        int i=0;int j=w.length-1;
        for(int k=0;k<w.length;k++){
            if(w[k]>='A'&&w[k]<='Z'){
                w[k]=(char)(w[k]-'A'+'a');
            }
        }
        while(i<j){
            if((w[i]>='a'&&w[i]<='z')||(w[i]>='0'&&w[i]<='9')){
                if((w[j]>='a'&&w[j]<='z')||(w[j]>='0'&&w[j]<='9')){
                    if(w[i]!=w[j]){
                        return false;
                    }
                    i++;j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return true;
    }
}


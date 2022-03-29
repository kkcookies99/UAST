 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sbs[i]  = new StringBuilder();
        }
        int idx=0;
        boolean asc = true;
        for(char ch :s.toCharArray()){
            sbs[idx].append(ch);
            if(asc){
                idx++;
                if(idx==numRows-1){
                    asc=false;
                }
            }else{
                idx--;
                if(idx==0){
                    asc=true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder temp:sbs){
            sb.append(temp);
        }
        return sb.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



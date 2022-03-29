 class Solution {
    public String XXX(String[] strs) {
        int index=0;
        try{
            a:for(;;index++){
                char c=strs[0].charAt(index);
                try{
                    for(String temp:strs){
                        if(temp.charAt(index)!=c){
                            break a;
                        }
                    }
                }catch(Exception e){
                    break;
                }
            }
        }catch(Exception e){}
        return strs[0].substring(0,index);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


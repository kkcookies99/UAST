class Solution {
    public int XXX(String s) {
        int len = s.length();
        int count = 0;
        boolean judge = false;
        if(s.isBlank())
            return 0;
        if(s.charAt(len-1) == ' ')
            judge = true;
        for(int i = len-1 ; i >=0 ; i--){
            if(s.charAt(i)==' '){
                if(judge == false)
                    return count;
                else{
                    continue;
                }                  
            }            
            count++;
            judge = false;
        }
        return count;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



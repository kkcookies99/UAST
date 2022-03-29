 class Solution {
    public int[] XXX(int[] digits) {
int  []asw=new int[digits.length+1];
     int jin=digits[digits.length-1]+1;
         if (jin>9){
             int h=1;
             for(int i=digits.length-1;i>0;i--){
                if((digits[i]+h)>9){
                    digits[i]=0;
                    asw[i+1]=0;
                }
                else {
                     digits[i]+=1;
                    return digits;
                }
             }
             if((digits[0]+1)>9){
                 asw[0]=1;
                 asw[1]=0;
                 return  asw;
             }
             else{
                 digits[0]+=1;
                 return digits;
             }
         }
         else {
             digits[digits.length-1]+=1;
             return digits;}
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



 class Solution {
    public String XXX(String s, int numRows) {
       if(s.length()<=numRows||numRows==1) return s;
        char[] newChats=new char[s.length()];
        char[] oldChats=s.toCharArray();
        short location;
        boolean fz;
        for(short i=0,j=0;i<numRows;i++){
            location=i;
            if(i>0&&i<numRows-1){
                fz=false;
                do{
                    newChats[j]=oldChats[location];
                    fz=!fz;
                    location+=fz?2*(numRows-i-1):i*2;
                    j++;
                }while (location<newChats.length);
            }else{
                do{
                    newChats[j]=oldChats[location];
                    location+=2*(numRows-1);
                    j++;
                }while (location<newChats.length);
            }
        }
        return new String(newChats);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


 class Solution {
    public int XXX(String haystack, String needle) {
       //return haystack.indexOf(needle); //Java中的indexOf方法
        
        if(needle.length()==0 ) return 0;
        if(needle.length()>haystack.length()) return -1;

        /*
        思路：遍历haystack字符串（j），将haystack的每个字符与needle.charAt(0)相比，
        如果相同，同时遍历needle字符串和haystack字符串，若能遍历到needle字符串的终点，
        说明找到位置，返回j
        */
        //int i=0;
        char cn = needle.charAt(0); 

        for(int j=0;j<haystack.length();j++){
            char ch = haystack.charAt(j);
            if(ch==cn){
                int m=j+1; 
                int k;
                //进行needle字符串和haystack字符串的同时遍历
                for(k=1;k<needle.length();k++){
                    if(m<haystack.length()){
                        char cnn = needle.charAt(k);
                        char chh = haystack.charAt(m);
                        if(chh!=cnn) break;
                        m++;
                    }else return -1;  //如果haystack字符串遍历到了终点，说明不存在needle字符串
            
                }
                if(k==needle.length()) { //遍历到needle字符串的终点，说明找到位置
                    return j;
                }
            }
        }

        return -1;
    }
}


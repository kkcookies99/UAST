 class Solution {
    public String XXX(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int length = s.length();
        int index = 0;
        int bigLen = 0;
        String subString = "";
        if(length!=0){
            subString += s.charAt(0);
            bigLen=1;
        }
        while(length>index){
            if(map.containsKey(s.charAt(index))){
                //计算是否是回文
                int lastIndex = map.get(s.charAt(index));//上一个相同字符
                if(index-lastIndex<3){
                    //产生回文
                    int before = lastIndex-1;
                    int after = index+1;
                    if((index-lastIndex)==1){
                        //此时两个相同字符相邻，可能会出现多个相同字符相邻的情况
                        while(before>=0 && s.charAt(index)==s.charAt(before)){
                            before--;
                        }
                    }
                    
                    while(before>=0 && after<length && s.charAt(before)==s.charAt(after)){
                        before--;
                        after++;
                    }
                    if(bigLen < (after-before-1)){
                        subString = s.substring(before+1,after);
                        bigLen = after - before - 1;
                    }
                }
                map.put(s.charAt(index),index);
                
            }else{
                map.put(s.charAt(index),index);
            }
            index++;
        }
        return subString;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


 class Solution {
    public boolean XXX(String s) {
        String str = s.toUpperCase();
        //使用双指针，减少空间复杂度
        int o = 0;//字符串起始位置
        int l = str.length() - 1;//字符串末端位置
        while(l >= o){
                if((str.charAt(o)>= 65 && str.charAt(o) <= 90) || (str.charAt(o) >= 48 && str.charAt(o) <= 57)){
                    //o指针所指向的位置为数字或者字母
                    if((str.charAt(l)>= 65 && str.charAt(l) <= 90) || (str.charAt(l) >= 48 && str.charAt(l) <= 57)){
                        //l指针所指向的位置为数字或者字母
                        if(str.charAt(o) != str.charAt(l)){
                                return false;
                        }else{
                            o++;
                            l--;
                        }
                }else{
                    l--;
                }
            }else{
                    o++;
                }
        }
        return true;
    }
}


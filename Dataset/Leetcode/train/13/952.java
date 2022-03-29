 class Solution {
    public int XXX(String s) {
        int num = 0;
        String[] ss = new String[s.length()];
        for(int i=0;i<s.length();i++){
            ss[i]=s.substring(i,i+1);
            
            if("M".equals(ss[i])){
                if(i>0&&"C".equals(ss[i-1])){
                    num += 800;
                }else {
                    num += 1000;
                }
            }else if("D".equals(ss[i])){
                if(i>0&&"C".equals(ss[i-1])){
                    num += 300;
                }else {
                    num += 500;
                }
            }else if("C".equals(ss[i])){
                if(i>0&&"X".equals(ss[i-1])){
                    num += 80;
                }else {
                    num += 100;
                }
            }else if("L".equals(ss[i])){
                if(i>0&&"X".equals(ss[i-1])){
                    num += 30;
                }else {
                    num += 50;
                }
            }else if("X".equals(ss[i])){
                if(i>0&&"I".equals(ss[i-1])){
                    num += 8;
                }else {
                    num += 10;
                }
            }else if("V".equals(ss[i])){
                if(i>0&&"I".equals(ss[i-1])){
                    num += 3;
                }else {
                    num += 5;
                }
            }else {
                num++;
            }
        }
        return num;
    }
}


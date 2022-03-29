class Solution {
    public String XXX(String a, String b) {
        int AIndex = a.length()-1;
        int Bindex = b.length()-1;
        char[] chars1 = AIndex > Bindex ?a.toCharArray():b.toCharArray();
        int index = chars1.length-1;
        while (Bindex>=0 && AIndex>=0){
            int i = a.codePointAt(AIndex--);
            int i1 = b.codePointAt(Bindex--);
            if(i+i1==98){
                chars1[index--] = '2';
            }else {
                chars1[index--] = i>i1?(char) i:(char)i1;
            }
        }
        System.arraycopy(AIndex > Bindex?a.toCharArray():b.toCharArray(),0,chars1,0,index+1);
        for (int i = chars1.length - 1; i >= 1; i--) {
            // 49 1 | 50 2
            int i1 = 0 + chars1[i];
            if (i1 > 49) {
                if(i1>=51){
                    chars1[i - 1] = (char) (0 + chars1[i - 1] + 1);
                    chars1[i] = '1';
                }else {
                    chars1[i - 1] = (char) (0 + chars1[i - 1] + 1);
                    chars1[i] = '0';
                }
            }
        }
        StringBuffer stringBuffer;
        if (0+chars1[0] >49) {
            if(chars1[0]=='2'){
                stringBuffer = new StringBuffer("10");
            }else {
                stringBuffer = new StringBuffer(Integer.toBinaryString(Integer.parseInt(""+chars1[0])));
            }
            for (int i = 1; i < chars1.length; i++) {
                stringBuffer.append(chars1[i]);
            }
        } else {
            stringBuffer = new StringBuffer();
            for (int i = 0; i < chars1.length; i++) {
                stringBuffer.append(chars1[i]);
            }
        }
        return stringBuffer.toString();
    }
}


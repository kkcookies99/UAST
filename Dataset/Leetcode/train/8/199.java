class Solution {
    static boolean mark;
    public static int XXX(String s) {
        mark = true;
        DFA.status = 0;
        int intValue = Integer.MAX_VALUE, high = intValue / 10, low = intValue % 10, num = 0;
        for(int i = 0; i < s.length(); i ++){
            System.out.println(i + " " + DFA.status);
            switch (DFA.getStatus(s.charAt(i))) {
                case DFA.SIGNED : {
                    if(!mark){
                        intValue = Integer.MIN_VALUE;
                        high = (~high) + 1;
                        low = (~low) + 1;
                    }
                    break;
                }
                case DFA.IN_NUMBER : {
                    int a = s.charAt(i) - '0';
                    if(mark){
                        if(num > high) return intValue;
                        if(num == high && a > low) return intValue;
                    }else{
                        if((~num) + 1 < high) return intValue;
                        if((~num) + 1 == high && (~a) + 1 < low) return intValue;
                    }
                    num = num * 10 + a;
                    break;
                }
                case DFA.END : {
                    if(!mark) num = (~num) + 1;
                    return num;
                }
            }
        }
        if(!mark) num = (~num) + 1;
        return num;
    }

    public static class DFA {
        public static final int START = 0;
        public static final int SIGNED = 1;
        public static final int IN_NUMBER = 2;
        public static final int END = 3;

        public static int status = 0;

        public static int[][] d = new int[][]{
                {START, SIGNED, IN_NUMBER,  END},
                {END,   END,    IN_NUMBER,  END},
                {END,   END,    IN_NUMBER,  END},
                {END,   END,    END,        END}
        };

        public static int getStatus(char c){
            if(c == ' '){
                status = d[status][0];
            }else if(c == '+'){
                status = d[status][1];
            }else if(c == '-'){
                if(status == 0)
                    mark = false;
                status = d[status][1];
            }else if(c >= '0' && c <= '9'){
                status = d[status][2];
            }else{
                status = d[status][3];
            }

            return status;
        }
    }
}


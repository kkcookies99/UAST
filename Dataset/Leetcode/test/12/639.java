    public String XXX(int num) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        // 取每一位数转换成罗马字符拼接
        while (num!=0){
            int base = num % 10 * count;
            count = count * 10;
            num = num / 10;
            builder.insert(0,transfor(base));
        }
        return builder.toString();
    }

    HashMap<Integer,String> table = new HashMap<>(){{
        put(1,"I");
        put(5,"V");
        put(10,"X");
        put(50,"L");
        put(100,"C");
        put(500,"D");
        put(1000,"M");
    }};


    private String transfor(int num) {
        String str = String.valueOf(num);
        int base = (int)Math.pow(10,str.length()-1);
        String code = table.get(base);
        String ans = "";
        for (int i = 0; i < num/base; i++) {
            ans = ans + code;
            // 对5个base进行修改

            if (ans.contains(code.repeat(5))){
                ans = ans.replace(code.repeat(5),table.get(base*5));
            }

        }

        // 对4个base进行修改
        // 1. 9
        if (ans.contains(table.get(base*5)+code.repeat(4))){
            ans = ans.replace(table.get(base*5)+code.repeat(4),code+table.get(base*10));
        }
        // 2. 4
        if (ans.contains(code.repeat(4))){
            ans = ans.replace(code.repeat(4),code+table.get(base*5));
        }

        return ans;
    }



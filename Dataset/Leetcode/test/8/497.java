 public int XXX(String s) {
        if (s.length() <= 0 || s == null) return 0;
        char[] chars = s.toCharArray();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' '){
                s1.append(s.substring(i,s.length()));
                break;
            }
        }
        chars = s1.toString().toCharArray();
        s1 = null;
        int a = 1;
        StringBuilder sb = new StringBuilder();
        try{
            if (chars[0] == '+' && s.length() > 1){
                for (int i = 1; i < chars.length ; i++) {
                    if (chars[i] >='0' && chars[i] <= '9' ){
                        sb.append(chars[i]);
                    }else {
                        break;
                    }
                }
                return sb.length() > 0?Integer.parseInt(sb.toString()) * a : 0;
            }else if (chars[0] == '-' && s.length() > 1){
                a = -1;
                for (int i = 1; i < chars.length ; i++) {
                    if (chars[i] >='0' && chars[i] <= '9' ){
                        sb.append(chars[i]);
                    }else {
                        break;
                    }
                }
                return sb.length() > 0?Integer.parseInt(sb.toString()) * a : 0;
            }else if (chars[0] >='0' && chars[0] <= '9'){
                sb.append(chars[0]);
                for (int i = 1; i < chars.length ; i++) {
                    if (chars[i] >='0' && chars[i] <= '9' ){
                        sb.append(chars[i]);
                    }else {
                        break;
                    }
                }
                return Integer.parseInt(sb.toString()) * a;
            }
            return 0;
        }catch (NumberFormatException e){
            long i;
            try{
                i = Long.parseLong(sb.toString());
            }catch(NumberFormatException w){
                return a < 0 ?Integer.MAX_VALUE * a - 1 : Integer.MAX_VALUE * a;
            }
            if (i != (int) i){
                return a < 0 ?Integer.MAX_VALUE * a - 1 : Integer.MAX_VALUE * a;
            }
            return 0;
        }catch(ArrayIndexOutOfBoundsException e){
            return 0;
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



     public static String XXX(String s) {

        if(s.length()<=1) {
            return s;
        }
        String longestStr = "";
        for (int i = 0; i<s.length(); i++) {
            //1.左右对称
            StringBuilder sb1 = new StringBuilder();
            for (int j = 1; j< s.length();j++) {
                if ((i+j)<s.length()&&(i+1-j)>=0)
                {
                    if(s.charAt((i+1-j))==s.charAt(i+j)){
                        sb1.insert(0,s.charAt((i+1-j)));
                        sb1.insert(sb1.length(),s.charAt(i+j));
                    }else {
                        break;
                    }
                }else {
                    break;
                }
            }
            //2.左中右对称
            StringBuilder sb2 = new StringBuilder();
            sb2.append(s.charAt(i));
            for (int j = 1; j<s.length();j++) {
                if(i-j>=0&&i+j<s.length()){
                    if(s.charAt((i-j))==s.charAt(i+j)){
                        sb2.insert(0,s.charAt((i-j)));
                        sb2.insert(sb2.length(),s.charAt(i+j));
                    }else {
                        break;
                    }
                }else {
                    break;
                }
            }
            if(sb1.length()>longestStr.length()) {
                longestStr = sb1.toString();
            }
            if(sb2.length()>longestStr.length()) {
                longestStr = sb2.toString();
            }
        }

        return longestStr;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


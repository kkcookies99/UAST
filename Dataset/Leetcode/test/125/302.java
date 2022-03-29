 public boolean XXX(String s) {
        String s3 = s.replaceAll("[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "");
        String[] blank=s3.split(" ");
        String s4="";
        for(int i=0;i<blank.length;i++)
        {
            s4+=blank[i];
        }
        StringBuffer sb = new StringBuffer();
        if(s4!=null){
            for(int i=0;i<s4.length();i++){
                char c = s4.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(Character.toLowerCase(c));
                }
                else{
                    sb.append(c);
                }

            }
        }

        String s2=sb.toString();

        boolean flag=true;
        String[] s1=s2.split("");
        int left=0;
        int right=s1.length-1;
        if(s2.length()<2)
        {
            return true;
        }
        else
        {
            while(right>left)
            {
                if(s1[left].equals(s1[right])==false)
                {
                    flag=false;
                    break;
                }
                else{
                    left++;
                    right--;
                }
            }
        }
        return flag;
    }


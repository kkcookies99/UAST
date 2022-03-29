 class Solution {
    public int XXX(String s) {
        int i=0;
        while(i<s.length()&&s.charAt(i)==' ') i++;
        if(i==s.length())return 0;
        if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!='-'&&s.charAt(i)!='+') return 0;
        boolean flag=false;
        if(s.charAt(i)=='-'){
            flag=true;
            i++;
        } else if(s.charAt(i)=='+'){
            i++;
        }
        if(i==s.length())return 0;
        if(!Character.isDigit(s.charAt(i)))return 0;
        double count =s.charAt(i++)-'0';
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            count=count*10+(s.charAt(i)-'0');
            i++;
        }
        if(flag) count*=-1;
        if(count<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        if(count>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        return (int)count;
    }
}


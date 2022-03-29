class Solution {
    public int XXX(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='I'||s.charAt(i)=='X'||s.charAt(i)=='C') && i<s.length()-1)
            {
                if(s.substring(i,i+2).equals("IV")){
                    count=count+4;
                    i=i+1;
                    continue;}
            if(s.substring(i,i+2).equals("IX")){
                count=count+9;
                i=i+1;
                continue;}
            if(s.substring(i,i+2).equals("XL")){
                count=count+40;
                i=i+1;
                continue;}
            if(s.substring(i,i+2).equals("XC")){
                count=count+90;
                i=i+1;
                continue;}
            if(s.substring(i,i+2).equals("CD")){
                count=count+400;
                i=i+1;
                continue;}
            if(s.substring(i,i+2).equals("CM")){
                count=count+900;
                i=i+1;
                continue;}
            }
            if(s.charAt(i)=='I'){
                count++;
                continue;}
            if(s.charAt(i)=='V'){
                count=count+5;
                continue;}
            if(s.charAt(i)=='X'){
                count=count+10;
                continue;}
            if(s.charAt(i)=='L')
                {
                count=count+50;
                continue;}
            if(s.charAt(i)=='C')
                {
                count=count+100;
                continue;}
            if(s.charAt(i)=='D')
                {
                count=count+500;
                continue;}
            if(s.charAt(i)=='M')
                {
                count=count+1000;
                continue;}
        }
        return count;
    }
}


class Solution {
    public int XXX(String s) {
        int sum=0;
        for(int i=0;i<s.length();){
            char cur=s.charAt(i);
            if(cur=='V') {sum+=5;i++;continue;}
            if(cur=='L') {sum+=50;i++;continue;}
            if(cur=='D') {sum+=500;i++;continue;}
            if(cur=='M') {sum+=1000;i++;continue;}
            if(i+1<s.length()){
                char next=s.charAt(i+1);
                if(cur=='I'&&next=='V') {sum+=4;i+=2;continue;}
                if(cur=='I'&&next=='X') {sum+=9;i+=2;continue;}
                if(cur=='X'&&next=='L') {sum+=40;i+=2;continue;}
                if(cur=='X'&&next=='C') {sum+=90;i+=2;continue;}
                if(cur=='C'&&next=='D') {sum+=400;i+=2;continue;}
                if(cur=='C'&&next=='M') {sum+=900;i+=2;continue;}
            }
            if(cur=='I') {sum+=1;i++;continue;}
            if(cur=='X') {sum+=10;i++;continue;}
            if(cur=='C') {sum+=100;i++;continue;}
        }
        return sum;
    }
}


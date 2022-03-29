public boolean XXX(int x) {
        int ans=0;
        int cur=x;
        while(x>0){
            ans=ans*10+x%10;
            x=x/10;

        }
        if(ans==cur){
            return true;
        }else {
            return false;
        }
    }


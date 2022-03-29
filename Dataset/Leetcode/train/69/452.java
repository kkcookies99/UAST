    public int XXX(int x) {
           return helper(x,0);
       }

    private int helper(int x, int res){
        if(Math.pow(res+1,2)>x){ //终止条件，一个也不能加
            return res;
        }
        int cur =1 ;
        // 0< Math.pow(res+2*cur,2) 防止越界突破Integer.MAX_VALUE
        while(Math.pow(res+cur,2)< x && Math.pow(res+2*cur,2)<=x && 0< Math.pow(res+2*cur,2)){
            cur = 2*cur;
        }
        return helper(x, res+cur);
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



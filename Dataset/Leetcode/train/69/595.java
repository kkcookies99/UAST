    public int XXX(int x) {
      double p =0.00;
        while(p<=x){
            if(p*p<x && (p+1)*(p+1)>x){
             return (int)p;
            }
            if(p*p==x) {
                return (int)p;
            }
            p++;
        }
        return 0;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



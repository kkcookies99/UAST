public int XXX(int x) {
        long rst=0;
        while(x!=0){
            rst= rst*10+ x%10;
            x=x/10;
           
        }
        if((int)rst!=rst){
            return 0;
            
        }else{
            return (int)rst;
        }        
}


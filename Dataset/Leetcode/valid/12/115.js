 var XXX = function(num) {
    const dict={1:"I",4:"IV",5:"V",9:"IX",10:"X",40:"XL",50:"L",90:"XC",100:"C",400:"CD",500:"D",900:"CM",1000:"M"};
    var ns=1;
    var s="";
    while(num>0){
        var p=num%10;        
        if(p>0&&p<4){
            for(var i=0;i<p;i++){
                s=dict[1*ns]+s;
            }
        }if(p==4 || p==5 || p==9){
            s=dict[ns*p]+s;
        }
        if(p>5 && p<9){
            for(var i=0;i<p-5;i++){
                s=dict[ns*1]+s;
            }
            s=dict[5*ns]+s;
        }
        num=parseInt(num/10);
        ns=ns*10;
    }
    return s;
};


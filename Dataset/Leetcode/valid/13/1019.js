 var XXX = function(s) {
    let num=0;
    for(let i=0;i<=s.length-1;i++){
       if(s[i]=='I'&&s[i+1]=='V'){num=num+4;i=i+1;continue;}
       if(s[i]=='I'&&s[i+1]=='X'){num=num+9;i=i+1;continue;}
       if(s[i]=='X'&&s[i+1]=='L'){num=num+40;i=i+1;continue;}
       if(s[i]=='X'&&s[i+1]=='C'){num=num+90;i=i+1;continue;}
       if(s[i]=='C'&&s[i+1]=='D'){num=num+400;i=i+1;continue;}
       if(s[i]=='C'&&s[i+1]=='M'){num=num+900;i=i+1;continue;}
       switch(s[i]){
           case 'I' : num=num+1;break;
           case 'V' : num=num+5;break;
           case 'X' : num=num+10;break;
           case 'L' : num=num+50;break;
           case 'C' : num=num+100;break;
           case 'D' : num=num+500;break;
           case 'M' : num=num+1000;break;
       }
    }
    return num;
};


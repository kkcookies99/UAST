var XXX = function(matrix) {
    let circleNum=Math.floor(matrix.length/2)
    for(let order=0;order<circleNum;order++){
        XXXCircle(matrix,order)
    }
};
function XXXCircle(matrix,order){
    let max=matrix.length-1-order
    let x=order
    let y=order
    let x2=order
    let y2=max
    let dir=2
    let dir2=1

    let tmp=[]

    do{
        if(dir==2){
            tmp.push(matrix[y][x])
        }
        if(dir2==2){
            matrix[y][x]=tmp.shift()
        }else{
            matrix[y][x]=matrix[y2][x2]
        }
        
        let res=move(x,y,dir,order,max)
        x=res[0]
        y=res[1]
        dir=res[2]
        
        res=move(x2,y2,dir2,order,max)
        x2=res[0]
        y2=res[1]
        dir2=res[2]
    }while(!(x==order && y==order))
    
}
function move(x,y,dir,order,max){
    switch(dir){
        case 0:
            y-=1
            if(y==order){
                dir=3
            }
        break;
        case 1:
            x+=1
            if(x==max){
                dir=0
            }
        break;
        case 2:
            y+=1
            if(y==max){
                dir=1
            }
        break;
        case 3:
            x-=1
            if(x==order){
                dir=2
            }
        break;
    }
    return [x,y,dir]
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



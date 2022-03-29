var XXX = function(root) {
let queue = [[root,0]],
    result = [];
while(queue.length > 0){
    
let task = queue.shift();
if(task[0] == null)
continue;
 result[task[1]] ? result[task[1]].push(task[0].val) : 
                   result[task[1]] = [task[0].val];
 queue.push([task[0].left,task[1]+1],[task[0].right,task[1]+1])

}

return result;
};




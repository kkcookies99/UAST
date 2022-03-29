 var XXX = function(s) {
    const newS = s.replace(/(\W|\_){0,}/g, '').toLocaleLowerCase();
    return newS === newS.split('').reverse().join('');
};


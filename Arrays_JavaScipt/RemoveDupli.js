 {
    let arr=[1, 2, 2, 3 , 5, 5];
    let unique=[];

    let found=false;

    for(let i=0;i<arr.length;i++){
        found=false;
        for(let j=0;j<unique.length;j++){
            if(arr[i]===unique[j]){
                found=true;
                break;
            }
        }
        if(!found){
            unique.push(arr[i]);
        }
    }
    console.log(unique)

 }
 
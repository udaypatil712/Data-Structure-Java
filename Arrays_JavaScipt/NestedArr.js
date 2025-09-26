{
    let arr=[[1,2,[3,4]],3];
    let target =3;
    let sum=0;
    console.log(arr[0][2])
    for(let i=0;i<arr.length;i++){
        for(let j=0;j<arr[i].length;j++){
            if(target === arr[i][j]){
                console.log("found..")
            }
        }
        if(target === arr[i]){
            console.log("is fouund..")
        }   
    }
    
}
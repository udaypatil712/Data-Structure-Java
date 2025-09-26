{
    let n=60;
    let  count=0;

    for(let i=0;i<n;i++){   // (n*n-1)/2
        for(let j=i+1;j<n;j++){
            count++;
        }
    }
    console.log(count)
}
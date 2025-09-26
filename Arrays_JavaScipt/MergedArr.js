{
    let arr=[1,3];
    let arr1=[2];
    let merged=new Array(arr.length + arr1.length);
    console.log(merged.length);

    for(let i=0;i<arr.length;i++){
        merged[i]=arr[i];
    }
    for(let i=0;i<arr1.length;i++){
        merged[arr.length +i]=arr1[i];
    }
    merged.sort();
    console.log(merged)
}
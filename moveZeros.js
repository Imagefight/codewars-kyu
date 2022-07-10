function moveZeros(arr) {
  let zeroCounter = 0;
  let arr1 = new Array();
  
  arr.forEach(element=>{
    if (element !== 0) {arr1.push(element);}
    else {zeroCounter++;}
  });
  
  for (let i = 0; i < zeroCounter; i++) {arr1.push(0);}
  return arr1;
}

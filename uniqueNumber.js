// Find the unique number in the Array
// The Array will have at least three numbers
// The Array will only contain Numbers
// No need to test for Edge Cases (Non-Numbers, Un-Defineds, Etc.)
function findUniq(arr) {
  // We always do magic in Programming!
  
  // Filter out duplicates so we can test every indvidual element for times seen
  let arr2 = Array.from(new Set(arr))
  // Reserve the answer for the return statement
  let ans = 0;
  
  arr2.forEach(element =>{
    // Check the Times an element has occured in the Array
    let check =     getTimesOccured(arr, element);
    // If the element has shown once in the array, it is Unique, Embed it into the Answer
    if (check == 1) {ans = element;}
  });
  
  // Return the Answer
  return ans;
}

function getTimesOccured(array, value) {
    // Filter the Array with only inputs of the same value; then output the length, return it.
    return array.filter((v) => (v === value)).length;
}

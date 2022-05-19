// Input will always be an array with numbers
// Inputs may be negative
// Inputs will always be whole numbers
// Arr a may be smaller than Arr b

// You are to compare two arrays and output the numbers which are not shared in these arrays
function arrayDiff(a, b) {
  
  // What does this do?
  /*
    Array.Filter creates a new array with all the elements that pass a provided test
    In this case, a.filter is passing in all of it's elements under the word "Item"
    in order to compare it to another method, "Indludes."

    Array.includes checks if an array has a value, so if array a's item is passed into b.includes,
    it is checking array b to see if the element is even in array b.
    
    Of course, the bang operator (!) is put before b.includes, therefore ultimately telling a.filter the following:

    "For every element from a, see if it is listed in array b, if one isn't, add to a new array."
  */
  return a.filter(item => !b.includes(item));
}

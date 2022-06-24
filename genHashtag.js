function generateHashtag (str) {
  let arr = str.split(" ");
  // Filter out Edge Cases:
  // If the input or the result is an empty string it must return false.
  if (arr.join("") == "") {return false;}
  // If the final result is longer than 140 chars it must return false.
  if (arr.join("").length > 139){return false;}
  
  // Iterator for enhanced for loop
  let iterator = 0;
  arr.forEach(word =>{
    // Capitalize the first letter then reassemble the word with .slice
    arr[iterator] = word.charAt(0).toUpperCase() + word.slice(1);
    iterator++;
  });
  
  // Join the words together
  return "#" + arr.join("");
}

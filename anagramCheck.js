/* Check if the words have the same characters as well as the same amount of characters.
 * Keep a store of each individual letter in the word provided,
 * as well as the amount of times the letter appears.
 * Make a seperate function contrasting the letters of a word from the words array
 * If the comparison fails, do not push to the anags (Anagrams) array
 * return the anags array
 */
function anagrams(word, words) {
  let letterStore = new Map();
  let anags = new Array;
  
  word.split("").forEach(letter =>{
    if (!letterStore.has(letter)) {letterStore.set(letter, 1);}
    if (letterStore.has(letter))  {letterStore.set(letter, letterStore.get(letter) + 1);}
  })
  
  words.forEach(sword =>{
    if (compareWords(letterStore, sword)) {anags.push(sword);}
  })
  
  return anags;
}

// Compare the two words
function compareWords(anag, word){
  let letterStore = new Map();
  let anagCheck = true;
  
  word.split("").forEach(letter =>{
    if (!letterStore.has(letter)) {letterStore.set(letter, 1);}
    if (letterStore.has(letter))  {letterStore.set(letter, letterStore.get(letter) + 1);}
  })
  
  if (letterStore.size !== anag.size) {anagCheck = false;}
  
  anag.forEach(function (value, key){
    console.log(letterStore.has(key) + " " + key);
    if (!letterStore.has(key)) {anagCheck = false;}
    if (letterStore.get(key) !== anag.get(key)) {anagCheck = false;}
  });
  
  return anagCheck;
}

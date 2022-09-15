function likeOrDislike(buttons) {
  // Let there be booleans!
  // These are here to keep track of what button has been pressed.
  let liked = false;
  let disliked = false;
  let normalized = true;
  
  // Go through the inputs (in order) to check the state of the user's actions
  buttons.forEach(input =>{
    // If the video is liked, toggle the liked state and remove any dislike flag.
    if (input == "Like")    {liked = !liked;
                             disliked = false;}
    // If the video is disliked, toggle the disliked state and remove any liked flag.
    if (input == "Dislike") {disliked = !disliked;
                             liked = false;}
    
    // Normalized will just check if there is no input at the end of these flags changing.
    let normalized = (!liked && !disliked);
  });
  
  // Return the end-status of the user's input!
  if      (liked)       {return Like;}
  else if (disliked)    {return Dislike;}
  else if (normalized)  {return Nothing;}
}

To build the Word count app, we have to build the structure first:
- Accept a line of text from user on the console.
- Count how many words are in the input.
- Display the number of characters(result) back to the user.
1. Handle User input:
* Java has some built in classes to read input from the console.
* The text given by the user should be saved in a file.
2. String manipulation:
* Process the input string to break it down into individual words.
* This involves splitting the strings using whitespace as the delimiter.
3. Error handling:
* what if the user enters only whitespaces or enters nothing at all.
* account for empty input or multiple spaces to avoid incorrect counts.
4. Output Display:
* the program should print the total number of words clearly after processing.

Step by Step:
- Ask user to enter a sentence or paragraph.
- read the input to using a console input method.
- break the input into words using a whitespace as the separator.
- remove any leading or trailing spaces.
- determine the number of elements in the processed result.
- print the count in the console.
- show a meaningful message if the input is blank or only whitespaces.
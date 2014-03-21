Guessing Game and Base Conversion(Lab 4)

Number Guessing Game
User picks a number between 1 and 100. Then computer tries to guess that number. Computer
makes guesses until it finds the number user picked. If the cmputer's guess is wrong, user should
provide the information of if the number is bigger or smaller than computer's guess. Output of the
application should be like below when user picks 42. Write the Guess Game Java application.

---------------------------------------------------------------------------------
-  Guessing: 50 (0:right guess 1:my number is lower 2:my number is higher) : 1	-
-  Guessing: 25 (0:right guess 1:my number is lower 2:my number is higher) : 2	-
-  Guessing: 37 (0:right guess 1:my number is lower 2:my number is higher) : 2	-
-  Guessing: 43 (0:right guess 1:my number is lower 2:my number is higher) : 1	-
-  Guessing: 40 (0:right guess 1:my number is lower 2:my number is higher) : 2	-
-  Guessing: 41 (0:right guess 1:my number is lower 2:my number is higher) : 2	-
-  Guessing: 42 (0:right guess 1:my number is lower 2:my number is higher) : 0  -

---------------------------------------------------------------------------------
Computer guessed 42 at 7 steps...

//Guess game pseudo code
Define lower and upper bounds
Set lower bound to zero and upper bound to hundred
while computer doesn't make right guess
guess= (upper+lower)/2
Prompt user guess and result
if(result is smaller)
upper bound= guess
else if(result is bigger)
lower bound=guess


2. Base Conversion
-------------------
Write a Java application that can convert numbers from base 2 to base 10 and vice versa. User
should be able to select items from a menu and then make conversions. An example output of
the base conversion is below.
Base Converter Program
1- Convert from base 10 to base 2
2- Convert from base 2 to base 10
3-Exit
Please choose an item: 1
Enter base 10 number: 57
57 in base 2 = 111001
1- Convert from base 10 to base 2
2- Convert from base 2 to base 10
3-Exit
Please choose an item: 2
Enter base 2 number: 1101
1101 in base 10 = 13
1- Convert from base 10 to base 2
2- Convert from base 2 to base 10
3-Exit
Please choose an item: 3
Tips & Tricks
To convert base 10 to base 2 you need to divide the number by 2 repeatedly and print the
remainders in reverse order
To print the remainder in reverse order ,not necessarily, String data type can be used
(String a=""; a=1+a; a=2+a; statements make a="21")
A base 2 number a is combined from digits (anan-1...a1a0)(2), equals to (a020+a121+...+an2n)(10)
Optional
user.
Write the conversion code from base 10 to base n and vice versa. n value can be entered by


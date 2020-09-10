#Part 2
 //Method option 1
    if (Letter.op1('a',1) !='b'){
      System.out.println("[op1] FAILED. 'a' + 1 should be 'b'.");
    }

 //Method option 2

    if (Letter.op2('a',Integer.MAX_VALUE) != 'x'){
      System.out.println("[op2] FAILED. 'a' + MAX_VALUE should be 'x'.");
     
    }
//Method option 3
    if (Letter.op3('z',1 ) != 'a' ){
      System.out.println("[op3] FAILED. 'z' + 1 should be 'a'. ");
    }

//Method option 4
    if (Letter.op4('A',-1) != 'Z'){
      System.out.println("[op4] FAILED. 'A' or 'a' -1 should be 'Z' or 'z'. ");
    }

#Part 3

1.)
Test #1
Timing for encryptTwo method:

real    0m2.752s
user    0m2.257s
sys     0m0.493s
Timing for encrypt method:
real    0m3.030s
user    0m2.317s
sys     0m0.476s

Test #2
Timing for encryptTwo method:

real    0m2.743s
user    0m2.274s
sys     0m0.463s
Timing for encrypt method:

real    0m2.762s
user    0m2.290s
sys     0m0.480s

Test #3
Timing for encryptTwo method:

real    0m2.871s
user    0m2.291s
sys     0m0.545s
Timing for encrypt method:

real    0m2.845s
user    0m2.298s
sys     0m0.486s

2.) 
In theory, the runtime for encryptTwo should be slightly faste than the runtime
for encrypt method. This would be due to the fact that Stringbuilder is 
appending characters to an already existing string without copying and 
creating a new String each time, whereas in encrypt, the method is generating
a new String each time the char from the array is copied to String. 

3.) 
The part a code was much harder to write than the part b code.
The part a code was not much faster to write than part b.
The part a code was more straightforward to write than part b.

#Summary
1.) The tests that i wrote in part two were essentially test cases for 
determining if the method letterOperation() and encrypt(), descrypt(), were
functioning properly and returning the correct values based on the correct
algorithim. These were edge case tests to check the upper and lower limit 
boundaries for the code.

2.) The Caesar Cipher program is designed to take a word as an input, and also
a numerical value, and the numerical value will rotate each letter in the word
provided, to that amount up or down on the alphabet. If the numerical value is
larger or smaller than the count of the total letter in the alphabet(25), then
the letter will wrap back around the alphabet. The Word provided will be 
encypted in a new word with the given numerical value for each letter, and then
the word will be decrypted back again to the original word. 
# CaesarCipher

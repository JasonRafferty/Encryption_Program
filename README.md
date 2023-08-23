# Encryption Program | Project 2

## Intro
For my second venture, I'm diving into the world of cryptography with an encryption program! 🌍🔍
This program harnesses the power of OTP encryption (One-Time Pad Encryption) 📜✨. OTP is a formidable encryption technique that stands uncrackable 🛡️, but there's a catch! It demands a one-time pre-shared key 🔑 for the magic to happen.

## Menu Functionality
 
The menu denoted in figure 1 presents four distinct options. To initiate the process, a new key must be generated. This key is derived using a substitution cypher that shuffles ASCII characters. Characters between 0 and 31 are excluded from the encryption program as are control characters. These characters are not printable symbols like letters, numbers, or punctuation marks.

<div style="display: flex; justify-content: space-between;">
  <div style="flex: 1; margin-right: 10px; border: 1px solid black; border-radius: 10px; padding: 5px;">
    <img src="https://github.com/JasonRafferty/Encryption_Program/blob/main/images/Screenshot%201.JPG" alt="Diagram" style="width: 250px; height: auto;">
    <p align="left">Figure 1: Encryption Interface</p>
  </div>

## Get Key 🗝️


 In Figure 2, the program clearly displays the original ASCII sequence alongside its shuffled version and can be called at any time using the "Get Key" functionality.




<div style="display: flex; justify-content: space-between;">
  <div style="flex: 1; margin-right: 10px; border: 1px solid black; border-radius: 10px; padding: 5px;">
    <img src="https://github.com/JasonRafferty/Encryption_Program/blob/main/images/Screenshot%203.JPG" alt="Diagram" style="width: 750px; height: auto;">
    <p align="left">Figure 2: ASCII Sequence with Coresponding Encryption</p>
  </div>

## Encryption and Decryption

 For encryption, let's consider the example in Figure 3 with the input "Hello World!". The program employs a substitution cypher that relies on the previously generated key 🔑. During the encryption process, the program replaces characters in the input message with corresponding characters from the key. This replacement is determined by the positions of the characters in the original ASCII sequence. The result is a transformed message that's as secure! 🔐

 


<div style="display: flex; justify-content: space-between;">
  <div style="flex: 1; margin-right: 10px; border: 1px solid black; border-radius: 10px; padding: 5px;">
    <img src="https://github.com/JasonRafferty/Encryption_Program/blob/main/images/Screenshot%202.JPG" alt="Diagram" style="width: 250px; height: auto;">
    <p align="left">Figure 3: Encryption Demo</p>
  </div>

During decryption, the process is reversed: characters from the encrypted message are matched with the key and then reverted to their original form. The key is central to both processes, ensuring that only someone with the correct key can accurately decrypt an encrypted message.

## Conclusion

This being my second project, I've delved deeper into the intricacies of software development, especially with the inclusion of error handling to ensure a seamless user experience 🛠️. As I look to the future, I'm excited about the prospect of adding a graphical user interface (GUI) to make the tool even more user-friendly and interactive as I gain more experience. 🖥️  Additionally, I aim to introduce features that enable users to save and retrieve encryption keys, facilitating decryption across different sessions or devices.


   <div style="flex: 1; margin-left: 10px; border: 1px solid black; border-radius: 10px; padding: 5px;">
    <img src="https://github.com/JasonRafferty/Tic-Tac-Toe/blob/master/TicTacToe/src/LogoHover.jpg" alt="Diagram" style="width: 100px; height: auto;">
  </div>
</div>

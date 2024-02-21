# DadBot
The fatherly humour that you never experienced
---
## Origin
I have absolutely zero recollection of when how or why I made this bot, but its been running on a raspberry pi for who knows how long. All I remember is that it used to work better than it does now, and I dont know how. I added a nice little token file so that my bot dosent get taken over and ruin my discord server, and fixed a curly brace that was probably put there to frustrate future me. It worked.

---
## Running DadBot
All I can tell you is that it runs fine on JDK (or JRE) 17. I switch between [Adoptium](https://adoptium.net/temurin/releases/?version=17) and [Zulu](https://www.azul.com/downloads/?version=java-17-lts&package=jdk#zulu).
To make life easier for myself, I made a shell file that would run the bot when I inevitably forget how to specify the Java path. It's very simple and looks something like this:
```
./[JDK Folder]/bin/java -jar DadBot-[VERSION]-SHADED.jar
```
With that as a reference, you can see how to make your own little startup script.

---
## Building the Project
In IntelliJ IDEA, Maven should already have set itself up, shade it and then package the jar (I have no idea if that's what I did to get the working jar).

---
# FAQ
### Q: Why is it not responding to all forms of "I'm"?
A: Because I don't know how to do that.

### Q: Wow you're so smart
A: I know.

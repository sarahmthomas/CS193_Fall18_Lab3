# CS 193 Lab 3 - Debugging, IntelliJ, & Vim
![](./images/debug_meme.png)

In this lab you will learn some of the fundamentals of debugging your code, as well as some of the tools you have at hand in 2 applications you'll be using a LOT in your CS Career:
- **IntelliJ IDE** (Integrated Development Environment)
- **Vim** (Text Editor)


## Part 1: Setup - "You can't build a great building on a weak foundation"

Debugging is a process that is greatly supplemented by _order_ and _organization_.

One way to ensure this is to configure your tools to the ideal settings, and to
take advantage of *YEARS* of gathered knowledge from the generations of computer 
scientists/developers who preceded you. 

### 1.1: Text Editors

>"If our colleges and universities do not breed people who riot, who rebel, who attack life with all the youthful **vim** and vigor, then there is something wrong with our colleges"

### 1.1.1: Know your commands! 
Vim's commands are unconventional, but were created with the purpose of making your life easy by making the text editing process as streamlined as possible. The purpose of Vim is to minimize time wasted scrolling, using the arrow keys, and moving from the keyboard to the mouse to navigate a file. 
This may seem like a bit of overkill, but you would be amazed just how much of your valuable time you will save as a developer if you become a vim power-user. 

There are a few tried and true methods to learn vim:

#### "The Vim Tutor!"
Enter a terminal environment where you have Vim installed (most UNIX-based systems like Linux, Mac, and Windows computers have it pre-installed).

Once you're in the shell, type just this command:
>vimtutor

Once you've entered the file, start reading and it'll walk you through everything! I recommend working through the whole file, and don't worry if you don't understand it all right away.

#### OpenVim
One great online services available to learn about Vim is an online tool called [OpenVim.com](https://OpenVim.com).

It's a lot more interactive than vimtutor, and offers a more comfortable environment to practice in.

Run through the tutorials on the website to get a solid grasp of vim, and bookmark it in case you forget!

#### Vim Cheat Sheet
Finally, if you ever need to quickly check what Vim commands are available (or if you'd like to expand your Vim vocabulary), check out these cheat sheets: 
- [https://vim.rtorr.com/](https://vim.rtorr.com/)
- [http://vimsheet.com/](http://vimsheet.com/)

### 1.1.2: A solid .vimrc goes a long way
#### What's the use of a .vimrc?
From the tutorials above, you should have learned about how Vim alleys you enter commands by typing colon ":" followed by your command.

Some commands, though, you don't want to have to type every time. For example, it's pretty normal to want line numbers whenever you open a file (it's really helpful for debugging!), BUT having to type 
>':set number'
every time you run Vim is a huge time suck! This is not what the great Vim designers would have wanted, and it's not what you want. 

Your .vimrc (Vim Run Control) file controls how the program Vim runs when it's invoked, and you can load it full of commands you don't want to have to type every time you open a file! 

#### Add Line Numbers

We recommend you use Vim to add the following command to your .vimrc file located in your home directory (~/.vimrc).
>'vim ~/.vimrc'
Add the text 'set nu' to the file, and save it!

Next time you open any file, you should see line numbers!

You can disable this at any time within a file by typing ':set nonumber' within Vim, or by deleting it from your .vimrc and then re-opening Vim again.

#### Add your own commands!
As you can imagine, there are thousands of commands you can leverage in your .vimrc file, and there's even more people who have their own custom .vimrc they think you should use. 

We want you to add _at least_ *3 more commands* to your .vimrc file, and turn it in.

For a great resource on .vimrc creating, read [this article](https://dougblack.io/words/a-good-vimrc.html). 

A favorite quote from that article that you should definitely adhere to is:
>"Don't put any lines in your vimrc that you don't understand."


### 1.2: Integrated Development Environments



## Part 2: Debugging Tools - "The most effective debugging tool is still careful thought, coupled with judiciously placed print statements."


Sometimes, it's as simple as flipping a boolean! (You know what they say about
booleans... even if you're wrong, you're only off by a bit ;) )


## Part 3: The Scenario - "One person’s crappy software is another person’s full time job."
Picture this: You land a great internship as a Freshman thanks to all the skills
you learned in CS193, and are put to the task of picking up where last year's 
 IU intern left off. Needless to say, they've left a mess of things, and it's
 up to you to identify what's wrong with their code! 

## Part 4: Sleuthing for Bugs - "Beware of bugs in the above code; I have only proved it correct, not tried it."

## Part 5: Submit Working Code - "Talk is cheap. Show me the code."

## Optional Extra - Customize your .vimrc to do Syntax Checking


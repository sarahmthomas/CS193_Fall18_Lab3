# CS 193 Lab 3 - Debugging, IntelliJ, & Vim
![](./images/debug_meme.png)

In this lab you will learn some of the fundamentals of debugging your code, as well as some of the tools you have at hand in 2 applications you'll be using a LOT in your CS Career:
- **Vim** (Text Editor)
- **IntelliJ IDE** (Integrated Development Environment)


## Part 1: Setup - "You can't build a great building on a weak foundation"

Debugging is a process that is greatly supplemented by _order_ and _organization_.

One way to ensure this is to configure your tools to the ideal settings, and to
take advantage of *YEARS* of gathered knowledge from the generations of computer 
scientists/developers who preceded you. 

### 1.1: Text Editors

>"If our colleges and universities do not breed people who riot, who rebel, who attack life with all the youthful **vim** and vigor, then there is something wrong with our colleges"

### 1.1.1: Know your commands! 
Vim's commands are unconventional, but were created with the purpose of making your life easy by making the text editing process as streamlined as possible. The purpose of Vim is to minimize time wasted scrolling, navigation with the arrow keys, and moving from the keyboard to the mouse to navigate a file. 

This may seem like overkill, but you'll marvel at how much time you save as a Vim power-user. 

There are a few tried and true methods to learn Vim:

#### "The Vim Tutor!"
Enter a terminal environment where you have Vim installed (most UNIX-based systems like Linux, Mac, and Windows computers have it pre-installed).

Once you're in the shell, type just this command:
>vimtutor

The file will walk you through everything! Work through the tutorial and don't worry if it doesn't all click right away.

#### OpenVim
One great open-source tool to learn about Vim is called [OpenVim.com](https://OpenVim.com).

It's a lot more interactive than `vimtutor`, and offers a more comfortable (and pretty) environment to practice in.

Run through the tutorials on the website to get a solid grasp of vim, and bookmark it in case you forget!

#### Vim Cheat Sheet
Finally, if you ever need to quickly check what Vim commands are available (or if you'd like to expand your Vim vocabulary), check out these cheat sheets: 
- [vim.rtorr.com](https://vim.rtorr.com/)
- [vimsheet.com](http://vimsheet.com/)

### 1.1.2: A solid .vimrc goes a long way
#### What's the use of a .vimrc?
From the tutorials above, you should have learned about how Vim enables commands by typing colon ":" followed by your command.

However, some commands you don't want to have to type _every time_. 

For example, it's pretty normal to want line numbers whenever you open a file (for debugging/readability), BUT having to type 
>`:set number`
every time you run Vim is a huge time suck! How can we avoid this.

Well, your .vimrc (Vim Run Control) file controls what commands run when vim is invoked, and you can customize it to your heart's content. These commands are run _every time you open a new file_.

#### Add Line Numbers

We recommend you use Vim to add the following command to your .vimrc file located in your home directory (~/.vimrc).
>`vim ~/.vimrc`
Add the text `set number` to the file, and save it!

Next time you open any file, you should see line numbers!

You can disable this at any time within a file by typing `:set nonumber` within Vim, or by deleting it from your .vimrc and then re-opening Vim again.

#### Add your own commands!
As you can imagine, there are thousands of commands you can leverage in your .vimrc file, and there's even more people who have their own custom .vimrc they think you should use. 

We want you to add _at least_ *3 more commands* to your .vimrc file, and turn it in.

For a great resource on .vimrc creating, read [this article](https://dougblack.io/words/a-good-vimrc.html). 

A favorite quote from that article that you should definitely adhere to is:
>"Don't put any lines in your vimrc that you don't understand."


### 1.2: Integrated Development Environments


## Part 2: Debugging Tools - "The most effective debugging tool is still careful thought, coupled with judiciously placed print statements."

### 2.1: 

### 2.2: "Dr. Strangebug" or "How I Learned to Stop Worrying and Love the IntelliJ Debugger"

## Part 3: The Scenario - "One person’s crappy software is another person’s full time job."
Picture this: You land a great internship as a Freshman thanks to all the skills
you learned in CS193, and are put to the task of picking up where last year's 
 IU intern left off. 
 
Needless to say, they've left a mess of things. It's up to you to identify what's wrong with their code! 

## Part 4: Sleuthing for Bugs - "Beware of bugs in the above code; I have only proved it correct, not tried it."

### 4.1: 

## Part 5: Submit Working Code - "Talk is cheap. Show me the code."

## Optional Extra - Customize your .vimrc to do Syntax Checking


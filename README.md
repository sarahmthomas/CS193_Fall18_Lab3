# CS 193 Lab 3 - Debugging, IntelliJ, & Vim
![](./images/debug_meme.png)

  In this lab you will learn some of the fundamentals of **debugging** your code, 
  as well as some of the **tools** you have at hand in 2 applications you'll be 
  using a LOT in your CS Career:
  - **Vim** (Text Editor)
- **IntelliJ IDE** (Integrated Development Environment)

## Part 1: Setup - "You can't build a great building on a weak foundation"

  Debugging is a process that is greatly supplemented by _order_ and _organization_.

  One way to ensure this is to configure your tools to the ideal settings, and to
  take advantage of *YEARS* of gathered knowledge from the generations of computer 
  scientists/developers who preceded you. This wisdom can be found in textbooks,
  forums like reddit, and in conversations with peers. 

  One of the most tangible outcomes of people wanting to streamline the process
  of writing code is the creation of the Text Editor.   

### 1.1: Text Editors

  Text Editors (such as **Vim**, Notepad++, and ... ~~GNU Emacs~~) are very general in their abilities:
  - You can read nearly any file BUT most this means you are forced to be generic
  - They typically have a minimalistic design that enables  

  For this course, we have decided to introduce the versatile Vim text editor.

### 1.1.1: Learn your Editor's commands! 
  >"If our colleges and universities do not breed people who riot, who rebel, who 
  attack life with all the youthful **vim** and vigor, then there is something wrong with our colleges"

  Vim's commands are unconventional, but were created with the purpose of making 
  your life easy by making the text editing process as streamlined as possible. 

  The purpose of Vim is to minimize time wasted scrolling, navigation with the 
  arrow keys, and moving from the keyboard to the mouse to navigate a file. 

  This may seem like overkill, but you'll marvel at how much time you save as a Vim power-user. 

  There are a few tried and true methods to learn Vim:

#### "The Vim Tutor!"
  Enter a terminal environment where you have Vim installed (most UNIX-based systems like Linux, Mac, and Windows computers have it pre-installed).

  Once you're in the shell, type `vimtutor`.

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
  `:set number` every time you run Vim is a huge time suck! How can we avoid this.

  Well, your .vimrc (Vim Run Control) file controls what commands run when vim is invoked, and you can customize it to your heart's content. These commands are run _every time you open a new file_.

#### Add Line Numbers

  We recommend you use Vim to add the following command to your .vimrc file located in your home directory (~/.vimrc): `vim ~/.vimrc`

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

                                                                                                                        An Integrated Development Environment (IDE) describes applications that contain:
                                                                                                                        - An extensive source code editor (often including syntax-checkers and
                                                                                                                            autocomplete options)
                                                                                                                        - Version Control System integration (track projects from Git and submit commit
                                                                                                                            messages!)
- Build automation tools (for when your project scales pretty far)
  - Some form of *Debugging Tools*!

  Companies like JetBrains have developed extensive IDEs for different types of 
  languages ([PyCharm](https://www.jetbrains.com/pycharm/) for Python, [IntelliJ IDEA](https://www.jetbrains.com/student/) for Java), 
  as well as different tasks (DataGrip for Databases, AppCode for iOS Development).

  [IntelliJ IDEA](https://www.jetbrains.com/student/), 
  [Eclipse](https://www.eclipse.org/downloads/), and []()

  For those of you in CS180, we expect that you have some very basic familiarity
  with the IntelliJ platform.

  In the event that you haven't encountered this platform yet, or just need a
  refresher, run through this link:  


## Part 2: Debugging Tools
![](./images/print_statements_meme.png)
### 2.1: "The most effective debugging tool is still careful thought, coupled with judiciously placed print statements."
  One of the most old-fashioned, yet effective, methods of debugging is **print
  statements**. 

  A print statement can be considered any form of output to the
  console, a file, or anywhere. 

  Consider the following (flawed) example. You're provided a snippet of code that 
  claims to perform a series of mathematical operations (by calling functions) on
  all numbers from 0 - N, and then storing them in a list of results.

```
  int n := 99
  results_list = []
  for i := 1 ... n: 
    int result := i
    func1(result, i) 
    func2(result, i)
    func3(result, i)
    results_list[i] := result
```

Let's look at some of the issues we might have here, and figure out how we'd
address them.

1) >"My results in the results list are incorrect! They just read '0,1,2,3...,N'!"
"The answer is wrong" is an often-repeated and uncomfortably-broad statement
that we've all made in the past. Rather than just scrapping everything and
restarting, let's dive a bit deeper and try to find out what our results are
in-between!




1) >"My results in the results list are incorrect! They just read '0,1,2,3...,N'!"

### 2.2: "Dr. Strangebug" or "How I Learned to Stop Worrying and Love the IntelliJ Debugger"


## Part 3: The Scenario - "One person’s crappy software is another person’s full time job."
Picture this: You land a great internship as a Freshman thanks to all the skills
you learned in CS193, and are put to the task of picking up where last year's 
IU intern left off. 

Needless to say, they've left a mess of things. It's up to you to identify what's wrong with their code! 

## Part 4: Sleuthing for Bugs - "Beware of bugs in the above code; I have only proved it correct, not tried it."

### 4.1:  

## Part 5: Submit Working Code - "Talk is cheap. Show me the code."

## Optional Extra - Customize your .vimrc with new features!



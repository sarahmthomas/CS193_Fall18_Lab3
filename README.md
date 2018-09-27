# CS 193 Lab 3 - Vim, IntelliJ, & Debugging
![](./images/debug_meme.png)

  In this lab you will learn some of the fundamentals of **debugging** your code, 
  as well as some of the **tools** you have at hand in 2 applications you'll be 
  using a LOT in your CS Career:
  - **Vim** (Text Editor)
  - **IntelliJ IDE** (Integrated Development Environment)

## Part 1: Setup - "You can't build a great building on a weak foundation"

  Debugging is a process that is greatly supplemented by _order_ and _organization_.

  One way to ensure this is to configure your tools to the ideal settings and to
  take advantage of *YEARS* of gathered knowledge from the generations of computer 
  scientists/developers who preceded you. This wisdom can be found in textbooks,
  forums like Reddit, and in conversations with peers. 

  One of the most tangible outcomes of people wanting to streamline the process
  of writing code is the creation of the Text Editor.   

### 1.1: Text Editors

  Text Editors (such as **Vim**, Pluma, nano, and ... ~~GNU Emacs~~) are very general in their abilities:
  - You can read nearly any file BUT this means you are forced to be generic
  - They typically have a minimalistic design that minimizes CPU/Memory Impact

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

  The file will walk you through everything you need to know about Vim! 
  
  While useful, a more recent (and better-looking) learning tool is out there...

#### OpenVim
  This great open-source tool for Vim-learning is called [OpenVim.com](https://OpenVim.com).

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
  `:set number` every time you run Vim is a huge time suck! How can we avoid this?

  Well, your .vimrc (Vim Run Control) file controls what commands run when vim is invoked, and you can customize it to your heart's content. These commands are run _every time you open a new file_.

#### TODO: Add Line Numbers

  We recommend you use Vim to add the following command to your .vimrc file located in your home directory (~/.vimrc): `vim ~/.vimrc`

Add the text `set number` to the file, and save it!

Next time you open any file, you should see line numbers!

You can disable this at any time within a file by typing `:set nonumber` within Vim, or by deleting it from your .vimrc and then re-opening Vim again.

#### TODO: Add your own commands!
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
  
  For those of you in CS180, we expect that you have some very basic familiarity
  with the IntelliJ platform.

## Part 2: Debugging Methods
![](./images/print_statements_meme.png)



### 2.1: "The most effective debugging tool is still careful thought, coupled with judiciously placed print statements."
  One of the most old-fashioned, yet effective, methods of debugging is **print
  statements**. 

  A print statement can be considered any form of output to the
  console, a file, or anywhere. 

  Consider the following (flawed) example. You're provided a snippet of pseudocode that 
  claims to perform a series of mathematical operations (by calling functions) on
  all numbers from 0 - N, and then storing them in a list of results.

  ```
  n := 99
  results_list := []
  for i := 1 ... n: 
    int result := i
    func1(result, i) 
    func2(result, i)
    func3(result, i)
    results_list[i].append(result)
  ```

  Let's look at some of the issues we might have here, and figure out how we'd
  address them. 

  1) >"My results in the results_list are incorrect! They just read '0,1,2,3...,N'!"
  
"The answer is wrong" is an often-repeated and uncomfortably-broad statement
that we've all made in the past. Rather than just scrapping everything and
restarting, let's dive a bit deeper and try to find out what our results are
in-between!

  ```
  int n := 99
  results_list := []
  for (i = 1; i < n; i++):
    print("Index: " + i)
    int result := i
    func1(result, i) 
    print("Result after func1: " + result)
    func2(result, i)
    print("Result after func2: " + result)
    func3(result, i)
    print("Result after func3: " + result)
    results_list[i].append(result)
  ```

  Some of the output we would see is:
  ```
  Index: 1
  Result after func1: 1
  Result after func2: 1
  Result after func3: 1
  Index: 2
  Result after func1: 2
  Result after func2: 2
  Result after func3: 2
  . . . 
  ```
  
  Through these print statements, we've realized an error: *We forgot to store
the result after we performed mathematical operations!"*

  While we WERE calling func1-func3 properly, we did not store the values
that they returned! They just went off into the void, and weren't reassigned to our result variable.

Solved:

  ```
  int n := 99
  results_list := []
  for (i = 1; i < n; i++):
    print("Index: " + i)
    int result := i
    result = func1(result, i) 
    print("Result after func1: " + result)
    result = func2(result, i)
    print("Result after func2: " + result)
    result = func3(result, i)
    print("Result after func3: " + result)
    results_list[i].append(result)
  ```

2) >"The output list is closer now, but there are still a lot of entries that seem to be incorrect!

At this point, choose a couple relatively complex entries. Write out (in its entireity) all the
steps you need to take to turn one of the cases that is currently incorrect into what the correct
answer would be. Then, figure out (using the prior print statements we had) which function or
statement of code is responsible for an unexpected output. For instance:
```
  Index: 31
  Result after func1: 961
  Result after func2: 1922
  Result after func3: The_Spanish_Inquisition
```

This indicates there is something *very* wrong occurring within the code of func3, since we are 
getting some wild output.

We should begin tossing print statements into there, in order to see where our
logic may have gone astray.

3) >"For some reason, all of my values are correct except for the first one, which is just 0"
 
As you may have noticed from our print statements before, the index we started with was "Index: 1". 
and if we had actually run the program, we would have only reached the (n-1)st index!

This shows us that we have something called a *Fencepost Error*. The Fencepost Error is an ancient
lesson best illustrated by a question: 
>"How many fenceposts do I need to create 3-meter zones over a 30 meter length?"

The naive answer would be to say you need only **10 fenceposts**, when in reality we need to include
11 fenceposts total to enclose the final zone.

Just like in that problem, we forgot to include the 0th index in our bounds. 

Solved:
  ```
  int n := 99
  results_list := []
  for (i = 0; i < n; i++):
    print("Index: " + i)
    int result := i
    result = func1(result, i) 
    print("Result after func1: " + result)
    result = func2(result, i)
    print("Result after func2: " + result)
    result = func3(result, i)
    print("Result after func3: " + result)
    results_list[i].append(result)
  ```

#### *Note on "The Wolf Fence Algorithm"*:
Imagine you were given the task of finding the only wolf in Alaska! 
That is a massive amount of area to cover; some might say even a lifetime isn't enough to take it all in.
However, if you're smart, you'd use the concept of the "wolf fence" to figure out the approximate location
of the wolf.

1) Set up a "Fence" that roughly cuts the area you are give in half
2) Listen for the sound of a wolf howling
3) Pick the side where the wolf howls, and repeat Step 1 using that side

This makes the task much easier, and halves the input area each time 
(later we'll call this an algorithm with log(n) time complexity). It's like
guessing a number. Why iterate through all numbers 1-100, when you could narrow
the problem down by having it each time?

This illustrates an important bit of wisdom about debugging in general (with or without print statements):
*It's important not to become overwhelmed by the scale of a bug; Once localized, the intractable challenge
could be as simple as turning ">" into "<" or a true to a false.*

Think print statement debugging is of limited use? It's actually a crucial method used in
postmortem debugging (this consists of reading through logs produced through the execution
of a program). 

Having well-placed log statements is EXTREMELY important, and top scientists know this too!
Check out [this new research paper](https://dl.acm.org/citation.cfm?id=3132778)
about Log20, a tool that determines a near optimal placement of log printing statements.


### 2.2: "Dr. Strangebug" or "How I Learned to Stop Worrying and Love the IntelliJ Debugger"
While print statements are absolutely useful for isolating a problem, debugging can still
be quite difficult and scale poorly. Nothing is more difficult to sift through than 2KB of
log files or output text when all you needed to do was step through your code a bit to determine
what was wrong.

*In an ideal world, we'd want to be able to walk through our code step-by-step, and figure out
what's going on DURING execution...*

#### INTRODUCING: THE INTELLIJ DEBUGGER!
The IntelliJ Debugger allows you to:
- Step through the execution of a program line-by-line
- Set *breakpoints* at important sections of code
    - Execution will pause at the breakpoint
    - You may either *step* through execution or *continue* to the next breakpoint
- Track the value of variables throughout execution & check if they are modified 

If you're having a hard time with using the debugger, visit 
[this link](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html)

## Part 3: The Scenario - "One person’s crappy software is another person’s full time job."
Picture this: You land a great internship as a Freshman thanks to all the skills
you learned in CS193, and are put to the task of picking up where last year's 
IU intern left off. 

Needless to say, they've left a mess of things. It's up to you to identify what's wrong with their code! 

### 3.1: Check out this repository from version control
Without getting too deep into the commands of git, we want to "clone" our repository and edit it locally
like any other file (if you are interested, [check out this guide](http://rogerdudler.github.io/git-guide/) 

IntelliJ has a great deal of support for exactly this! We can store a local version of our repository, and 
push any changes to the remote repo easily!

#### How to clone remote repo to local repo and manage it with IntelliJ

0) Close any projects you have open

**File --> Close Project**

You should now see the main IntelliJ screen.

1) Checkout a project from Version Control

You will want to be at the main IntelliJ screen  and select **Check out from Version Control --> GitHub** (Git is also acceptable).

NOTE: If you just clone without letting IntelliJ configure everything for you, it's a pain in the butt to fix. Please let IntelliJ create everything for you!

ANOTHER NOTE: If you did not close projects and end up on the main IntelliJ screen, you can also just go to **VCS --> Checkout from Version Control**

2) Enter your credentials for GitHub using Auth Type: Password

![](./images/intellij-github-signup.png)

3) Select the correct repository to clone

![](./images/intellij_checkout_repo.png)

4) Make some changes to the documents (don't worry about if it can run yet -- comments are fine too)

![](./images/print_before.png)
![](./images/print_after.png)

5) Commit and push your changes

![](./images/intellij_commit_button.png)
![](./images/intellij_commit_dialog.png)

6) Confirm you'd like to push changes

![](./images/intellij_push_dialog.png)

#### NOTE: Each time you open this project, make sure you PULL to make sure your local repository is up to date with the remote repository

![](./images/intellij_pull_button.png)


### 3.2: Sleuthing for Bugs - "Beware of bugs in the above code; I have only proved it correct, not tried it."
*TODO:* You will be expected to find several bugs throughout the files *MathUtils.java* and *StringUtils.java*.
All test cases should pass for your to receive full points. 

You should use multiple methods to determine what's wrong:
- JUnit Test Cases -- Try running them individually and debugging them in isolation!
- Print Statements after writing examples in *BuggyUtilClient.java*
- Reading through the code to see if it makes sense

#### How to run and debug the JUnit test cases

1) Configure IntelliJ for JUnit

![](./images/test-pre-import.png)

You just need to hit ALT + ENTER and choose "Add JUnit4 to classpath". ALT + ENTER is your friend in IntelliJ :) 

![](./images/test-resolve-import.png)

2) Run all the test cases

You can run all test cases by right clicking the test case file.

![](./images/test-run-all.png)

##### Note on test case results:
- ![](./images/test-green.png) is good, because you passed all checks
- ![](./images/test-yellow.png) means you got a wrong result in a test case
- ![](./images/test-red.png) means an exception was encountered when running the case

3) Run a particular test case

You can also isolate a single test case and run only that one by right-clicking it.

![](./images/test-run-one.png)

This results in:

![](./images/test-run-one-result.png)

4) Find the line where it goes wrong

Once the test case fails, you can pinpoint the exact issue by double-clicking the failed
case. This will show you either the assert statement you got incorrect, or the line where
an exception was encountered.

![](./images/test-highlight.png)

5) Set method and line breakpoints and start test case in Debug mode

Set some breakpoints in the methods you suspect this test case has 
touched, and then run the test case in Debug mode.

![](./images/test-start-debugging.png)

6) Continue stepping through the code and find the issue

You can see the step-by-step execution of your code, as well as the values of variables
and how they change.

To move onto the next breakpoint sector, you have to resume the program.

![](./images/test-step-button.png)

7) Take advantage of the information you find, and just keep stepping!

![](./images/test-middle-of-debugging.png)

### 3.3: Submit Working Code - "Talk is cheap. Show me the code."
*TODO:* You should submit code that passes all test cases! 

*REMEMBER: Just because something OUGHT to work, does not mean it will. Always question any assumptions
or claims made about how code behaves!*

## TODO -- What needs to get done for this project
- Add 3 commands to your ~/.vimrc file
- Pull Git Repository into IntelliJ
- Use print statements and the IntelliJ Debugger to fix the code
- Submit working code to remote repository that passes all test cases


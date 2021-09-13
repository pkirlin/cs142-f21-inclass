# Tic Tac Toe

Team members (edit these):
1. Team member 1
1. Team member 2
1. Team member 3...

## Goals

By the time you are done with this activity, you should be able to:
* decompose a program into static methods with Javadoc comments.
* use multidimensional arrays.
* instantiate objects and call instance methods on them.
* work with your team more effectively.

Recall from the first lab that you should have a _driver_ and a _navigator_. It
is the job of the navigator to write your team's answers to the 
questions. At the end of lab, the navigator should share the answers with the
driver, and the driver should share any code with the navigator, so that both of
you have the project files.

For all answers, use complete sentences.

## Playing the game

Run `TicTacToe.java` to play the game. This is a two-player game, so you and your 
partner should play against one another. Play four times, alternating who goes 
first.

## Part A: Representing the game board on the canvas

* A tic-tac-toe board has three rows and three columns.  But how big is the
    canvas the program uses (width by height, in pixels)?

__Your answer here__

* Look at the `draw()` function.  What do the four `drawLine()` calls do?

__Your answer here__

* What does the nested for loop do?  What is the purpose of the `cx` and 
`cy` variables and why are they calculated the way they are (on lines 18
and 19)?  In particular, why does `cx` use `col` and `cy` use `row`?

__Your answer here__

* Go to the `handleMouseClick()` function.  Notice the variables 
`mouseX`, and `mouseY`.  Add a `println()` statement to print out these
variables after they are defined.  Now play the game again.

What do these variables represent in the game?

__Your answer here__

* Now look at the variable definitions for `row` and `col` in the same 
function.  Add in code to print them out as well.  Play the game again.

What do these variables represent in the game?

__Your answer here__

* Drawing on your work for the previous questions, explain in a few
sentences how the game uses math to simultaneously store the state of the
game in a 3x3 board and also display it on a 300x300 canvas.  How are the
(row, col) coordinates on a 3x3 board converted back and forth to/from
(x, y) coordinates on the canvas?

__Your answer here__

### End of Part A: Stop and check-in.  If I'm busy, feel free to go on.

## Part B: Static methods and Javadoc comments

* Find the `main` method.  This method has a few calls to the `draw()`
method.  Hover over one of them, and you'll get a pop-up tooltip. 
Where (in this program) did the descriptive text in the tooltip come from?

__Your answer here__

* Does editing that text change what appears in the tooltip?

__Your answer here__

* Does the tooltip still use that text if the comment starts with `/*` instead
   of `/**`?

__Your answer here__

* What causes the loop below to end?  You may need to look inside of the
`gameOver()` method.

```
while (!gameOver(board)) {
  handleMouseClick(canvas, board, currentPlayer);
  currentPlayer = opposite(currentPlayer);
  draw(canvas, board);
}
```

Remember to use a complete sentence.

__Your answer here__

* How does the behavior of the game change if you comment out the line that
begins `currentPlayer = opposite...` 
Note that you can comment out the line by adding `//` to the beginning of the
line.

__Your answer here__

* Copy the line of code that you just commented out and paste it into the
program at the end of the `handleMouseClick()` method (after the while
loop ends).  So this line of code should be still commented out in `main()`
but now should happen at the end of `handleMouseClick()` instead.

Does this restore the game's behavior to how it is supposed to be?  Why
or why not?

__Your answer here__

### Restore the game to a working state if you need to.
**Remove the line you added to `handleMouseClick()` and 
uncomment it in `main()`.**

* Do you feel like you understand how this program works at a high level?

__Your answer here__

* Do you feel like you understand the details of `draw()`, `gameOver()`,
and `handleMouseClick()`?  If not, ask me for help.

__Your answer here__

### End of Part B: Stop and check-in.  If I'm busy, feel free to go on.

## Part C: Multidimensional arrays

* After the line in the `main` method

```
char[][] board = new char[3][3];
```

what is the value of `board.length`? Guess and then use
a `println` statement to see if you are correct.

__Your answer here__

* What is the value of `board[0].length`? Does this change if the two numbers
    on the line in the previous question are different? You can change the values
    and run the code to see what happens.

__Your answer here__

* What does the nested loop below accomplish?

```
for (int row = 0; row < board.length; row++) {
     for (int col = 0; col < board[row].length; col++) {
          board[row][col] = ' ';
     }
}
```

__Your answer here__

The `winner` method contains the following statement:

```
int[][][] winningCombos = 
    { { { 0, 0 }, { 0, 1 }, { 0, 2 } },
    { { 1, 0 }, { 1, 1 }, { 1, 2 } },
    { { 2, 0 }, { 2, 1 }, { 2, 2 } },
    { { 0, 0 }, { 1, 0 }, { 2, 0 } },
    { { 0, 1 }, { 1, 1 }, { 2, 1 } },
    { { 0, 2 }, { 1, 2 }, { 2, 2 } },
    { { 0, 0 }, { 1, 1 }, { 2, 2 } },
    { { 0, 2 }, { 1, 1 }, { 2, 0 } } };
```

* After this statement, what is `winningCombos.length`?

__Your answer here__

* What is `winningCombos[0].length`?

__Your answer here__

* Which part of the statement (some of the curly braces, commas, and numbers)
    represents `winningCombos[0]`?

__Your answer here__

* What is `winningCombos[0][0].length`?

__Your answer here__

* Which part of the statement represents `winningCombos[0][0]`?

__Your answer here__

* What does each pair of numbers represent?

__Your answer here__

* What does each group of three pairs represent?

__Your answer here__

The `winner` method continues with the following for loop:

```
        for (int i = 0; i < winningCombos.length; i++) {
            int[][] combo = winningCombos[i];
            char a = board[combo[0][0]][combo[0][1]];
            char b = board[combo[1][0]][combo[1][1]];
            char c = board[combo[2][0]][combo[2][1]];
            if (a != ' ' && a == b && b == c) {
                return a;
            }
        }
```

* What does each pass through the loop accomplish?

__Your answer here__

* Under what circumstances does the loop exit early?

__Your answer here__

* Under what circumstances does the loop complete all of its passes, allowing
    the program to proceed to the last line of the function?

__Your answer here__

* Would the code be more or less clear if it had a separate if statement for
each of the eight possible winning combinations? Would it be longer or 
shorter? Would your answer be different for a game that had a hundred ways to win
instead of eight?

__Your answer here__

### End of Part C: Stop and check-in.  If I'm busy, feel free to go on.

## Part D: Colors

* Notice how in `draw()`, the code always uses `Color.RED` and `Color.BLUE`
for the two players.  In this section we will make the game use
randomly-generated colors instead.

In the `main()` function, create two new Color objects after the call to
`canvas.show()`.  To create the objects, use the three-argument color
constructor with the values (0, 255, 0) for the first color (green), 
and whatever numbers you want for the second (but don't get distracted
finding pretty colors!)

Now edit your `draw()` function to take two additional parameters, that
will be the colors for the circles for the "X" player and the "O" player.
Modify the code in `draw()` to draw the circles using the colors specified
by these parameter variables, rather than just Color.RED and Color.BLUE.

Now edit `main()` so that green is used for the "X" player and your second
color is used for "O".  Do this by modifying the call to `draw()` in 
`main()`.

Does your game now display circles with green and your second color?

__Your answer here__

* Now we will modify `main()` to pick the colors randomly.  In `main()`,
write code to generate six random numbers between 0-255.  Use these
as arguments to the two Color constructors, replacing the numbers you 
had there before.
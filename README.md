Poker -- Lab \#4

Before you begin, it's probably best you switch workspaces to have a
clean slate. To switch workspaces go to file Switch Workspace and pick a
new folder. You won't lose your older projects- you can switch back...

When you have a clean workspace, clone the Lab4Starter repo, found here:

<https://github.com/CISC181/Lab4Starter>

The github has three projects:

**FlamingoBLL** --Game logic. We started working on this in Lab \#2 and
Lab \#3.

**FlamingoJabber** -- Messaging Layer of the application. We're not
going to make any changes in this layer (it works great!). This layer
implements a LBQ (LinkedBlockingQueue) to pass ordered messages between
threads.

**FlamingoFX** -- Presentation layer of the application.

After you clone the github, build the projects. Build FlamingoBLL and
FlamingoJabber with 'clean install' maven goals. Build the
FlamingoJavaFX with jfx:run goal (instead of 'clean install', use
'jfx:run').

I want you to make the following changes:

**FlamingoBLL**

![](media/image1.png){width="6.5in" height="3.9583333333333335in"}

-   The 'Table' class uses a HashMap for Players ('hmTablePlayers).

-   Complete the implementation for AddPlayerToTable. Add the passed
    Player object to the TablePlayers HashMap.

-   Complete the implementation for RemovePlayerFromTable. Remove the
    passed Player object from the TablePlayers HashMap.

-   Complete the implementation for GetPlayerFromTable.

-   Complete the implementation for ClearTable (clear the HashMap).

Do the same for class 'GamePlay'.

Create JUnit tests for Table and GamePlay. Example... Create a table,
create a Player, add the Player to the table, get the player from the
table, remove the player from the table.

**FlamingoJabber** -- NO CHANGES!

**FlamingoJavaFX**

BlackJack.fxml & BlackJackController.java

> BlackJack.fxml is the scene that will display the BlackJack game. The
> outer container is a 'border' pane. The border pane has five sections:
> north, south, east, west and center.
>
> North -- Dealer area
>
> South -- Player area
>
> Center -- Game player area

The player area will have the following buttons:

> Sit / Leave -- Will add/remove player from table. If player is seated,
> 'leave' is displayed, if player is not seated, 'Sit' is displayed
>
> Hit -- if game in progress, and it is the player's turn, this button
> is enabled if the player can hit (player total \< 21)
>
> Stand -- If game is in progress, and it is the player's turn, this
> button is enabled.

For this lab, I want to see the UI completed for BlackJack- we'll wire
up the controller method(s) and the game in the next lab. To ensure you
have the proper sizing, add card images to your scene (we'll be changing
the cards at runtime in later labs).

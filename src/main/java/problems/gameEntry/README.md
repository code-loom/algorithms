# ScoreBoard
Maintains a score board. A scoreboard is limited to a max number of high scores that can be saved. Once that limit is reached, a new score is added only if it is strictly higher than the lowest `high score` on the board.


## Assumption

* Since this is a list of high score, there will be an assumption that the list is stored in a sorted order of the score.

## Operations

- Add

  Once it has been determined that the entry should be kept, there are two remaining tasks

        - Properly update the number of entries.
        - Place the new entry in the appropriate location by shifting entries with inferior scores as needed.

- Remove

    It is possible to have a score being disputed for several reasons, hence it is a good idea to have the remove functionality on the scoreboard. What needs to be done is:

        - Identify the location of score, if it exists on the board
        - Remove the score and shift lower scores upwards
        - Do we need to keep track of latest score kicked out of the board for this feature? Or history of scores maintained offline?

## Implementation


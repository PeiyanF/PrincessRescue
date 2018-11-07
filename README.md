# PrincessRescue

Passable (ground) and impassable (rock, wall, etc.) tiles.
Tiles with effects
- Temporary: change player’s attributes temporarily when player is positioned at the tile (swarm land, high land)
- Permanent: regain attribute points - HP, ATTACK (potions, weapons)

Opponents can be dragons, witches, guards. In principles, opponent (NPC) and player are the same based entity, i.e. have same attributes like HP, attack dmg, move point (to be used as reward point). To be elaborated more under Player.
NPC’s attributes are randomly assigned to satisfy requirement of random element, e.g. HP randomly in range of 10-15, attack deal in range 1-3

Every time player defeats an NPC, he gains EXP which are required to reach a certain level to rescue the princess. The minimum EXP required varies based on game difficulty.
Minimum of EXP required and EXP gained should be displayed on the game board to reflect game progress (which is unavailable in Dancing with the stars)
In short, player has 2 goals: find the location of the princess and get enough EXP to rescue her.

Game difficulty is determined by
- Map size
- EXP required
- Size of visible range (maybe?)
- NPC attributes (higher HP, higher attack dmg)

Fog of war concept: When player moves to a new tiles, a certain range of tiles around that tile will be revealed. Visited range will remain visible.
Player is only allowed to move up, down, left, right. It’s more difficult to calculate algorithm for path finding if diagonal moves are allowed.
Movement is restricted within the visible range (unlike Dancing with the stars)

- HP: If player’s HP reaches 0, the game is lost. An NPC is defeated when it’s HP reaches 0.
- Attack point: New HP = Current HP - Attack
- EXP: EXP can be gained by defeating NPCs.
- Move point: This is the energy attribute. Game is lost when move point of player reaches 0. Move point of an NPC does not impact challenge outcome, but acts as reward points. Allowing move point to be replenished each time player defeats an NPC encourages player to defeat more NPCs before he finds the princess.
Player can choose to allocate max HP and attack point at the beginning of the game (higher HP - lower ATTACK, lower HP - higher ATTACK).

The final score = remaining move point

# ZenScript-Writer
GUI based ZenScript writer for adding recipes to Minecraft via CraftTweaker

The Mod CraftTweaker for the game Minecraft allows users to create custom recipes for the machines from other mods. This is done using ZScript.
Different mods will implement the addRecipe method but will use differing arguments in differing orders. For example two mods may add an alloy furnace that takes two items as input and gives one item as output.
However, one mod may order arguments as input, input, output and the other as output, input, input..
Some mods require an argument for energy whilst others may require power and time.
The information for the syntax of add recipe commands is available, however it can be inconvinient to have many tabs open for different machines, as well as having to write out full commands.

This project uses Java Swing to create a GUI that prompts users for the correct arguments to add a recipe for a chosen machine and automatically constructs the full command which is written to a file that can
be inserted into the users script folder in their Minecraft installation.

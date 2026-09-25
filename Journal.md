# Journal
How is your code different when using an ArrayList instead of an Array? What do you find easier and/or harder about it?

When using an ArrayList, you aren't restricted by a fixed size, and its built-in methods make complex logic much simpler to handle. Features like built-in removal and automatic array formatting make managing items effortless. 
The main adjustment is remembering to use method calls like .get() and .set() to access and update elements rather than standard bracket notation.



_______________________


Explain the logic behind your risk filter. How did you decide which boolean operators were appropriate for identifying high-risk items?

The risk filter was based on whether the item would be difficult to obtain. The higher the risk to acquire the greater the value. 
I chose the logical OR operator because it would flag an item if at least one of the conditions is true. 




________________________


Describe the process of refactoring your code from Main into the TradingPost class. What are the benefits of moving this logic into its own class rather than keeping it all in the main method?

To refactor the program, I declared the ArrayList as a private field inside the TradingPost class and created dedicated methods (addItem, removeItem, etc.) to handle inventory operations. This allowed Main to focus solely on instantiating the TradingPost object and calling its public methods.

Making the inventory list private protects the data by preventing external code from altering it directly. Moving this logic into its own class establishes clear responsibilities: SupplyCrate manages individual item properties, TradingPost manages the item collection and enforces trading rules,
and Main orchestrates tests and runs the program. This separation of concerns creates a clean, maintainable structure that makes the application easily scalable.
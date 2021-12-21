# Tech Elevator Final Capstone - Comic Keepers

This is my final capstone project from Tech Elevator, Comic Keepers. We were placed in groups of four & tasked with using Agile Methodologies to create a full stack app that allows users to create & manage comic book collections, & we had only 10 working days to do it. We built a relational database to manage users, collections, & stored comics/characters, & our own RESTful API to link that data with our front-end Single Page Application. We also consumed a robust 3rd party API from Marvel Comics to operate as the source of all of that data & to populate our application with beautiful cover art & information about each comic.


## Technology Used

Java

JUnit

Spring Boot

SQL/Relational Database Management

HTML

CSS

Javascript

Vue.js


## Lessons Learned

This was a wild ride, that's for sure. We had a somewhat difficult group dynamic that resulted in diplomacy playing a key role, & in the end, put my experienced managerial skills to the test. About a quarter of the way through the project, a teammate made the simple error of renaming many of the server classes, which casused some Spring Boot dependancy issues & required most of the back-end to be rewritten. Later on in the process, there was a front-end bug that left two of us without the ability to use VS Code's Live Server feature, & took about two days to track down.

Ultimately, I learned just how difficult the software development process can be, & how to push through the distractions to arrive at a finished product. You have to be agile & ready to pivot - sometimes your best laid plans aren't quite going to pan out, so you need to be ready to accept alternative paths, & make forward progress for the good of the project as a whole.


## My Place In The Team

For most of this project, I was working on building our server-side RESTful API. I wrote many of the model, DAO, JDBCDAO, & Controller classes & the methods within, which also required a solid grasp of our database & SQL aggregate queries.

Additionally, I made the custom header & each of the custom navigational buttons, resulting in taking a large role in the visual design of the project.


### A Little About Comic Keepers:

The site consists of the following:

1. A home landing page, listing the currently existing collections with a preview of what's inside of them.
![HomeScreen](https://user-images.githubusercontent.com/90332162/146983358-bf1768dc-4c5e-45df-b4e5-8bd3790b6a9a.PNG)
2. A collections detail page, that shows the contents of a specific collection.
3. A comic detail page, showing the specifics about an individual comic.
4. A statistics page, really just a character tracker that automatically updates whenever a new character is added to the database, by way of an appearance in a comic added from the Marvel API. This could be fleshed out to a much greater (and cooler) detail, & be a great source of information on the thousands of characters in the Marvel Universe.
5. A search page, that allows you search for any comics from Marvel that feature a given character. This is another feature that I would love to implement more completely, & give the user to search for more than just characters - i.e. comic title, series name, event name, etc.
6. My Collections (for an authenticated user), that allows a user to manage their own collections.

1. An unauthenticated user lands on the home page & can view existing collections, 








1. The vending machine dispenses beverages, candy, chips, and gum.
   - Each vending machine item has a Name and a Price.
2. A main menu displays when the software runs, presenting the following options:
    > ```
    > (1) Display Vending Machine Items
    > (2) Purchase
    > (3) Exit
    > ```
3. The vending machine inventory is stocked via an input file when the vending machine
starts.
4. The vending machine is automatically restocked each time the application runs.
5. When the customer selects "(1) Display Vending Machine Items", they're presented
with a list of all items in the vending machine with its quantity remaining:
    - Each vending machine product has a slot identifier and a purchase price.
    - Each slot in the vending machine has enough room for 5 of that product.
    - Every product is initially stocked to the maximum amount.
    - A product that has run out must indicate that it is SOLD OUT.
6. When the customer selects "(2) Purchase", they are guided through the purchasing
process menu:
    >```
    >(1) Feed Money
    >(2) Select Product
    >(3) Finish Transaction
    >
    > Current Money Provided: $2.00
    >```
7. The purchase process flow is as follows:
    1. Selecting "(1) Feed Money" allows the customer to repeatedly feed money into the
    machine in valid, whole dollar amounts—for example, $1, $2, $5, or $10.
        - The "Current Money Provided" indicates how much money the customer
        has fed into the machine.
    2. Selecting "(2) Select Product" allows the customer to select a product to
    purchase.
        - It shows a list of products available and allows the customer to enter
        a code to select an item.
        - If the product code does not exist, the customer is informed and returned
        to the Purchase menu.
        - If a product is sold out, the customer is informed and returned to the
        Purchase menu.
        - If a valid product is selected, it is dispensed to the customer.
        - Dispensing an item prints the item name, cost, and the money
        remaining. Dispensing also returns a message:
          - All chip items print "Crunch Crunch, Yum!"
          - All candy items print "Munch Munch, Yum!"
          - All drink items print "Glug Glug, Yum!"
          - All gum items print "Chew Chew, Yum!"
        - After the product is dispensed, the machine updates its balance
        accordingly and returns the customer to the Purchase menu.
    3. Selecting "(3) Finish Transaction" allows the customer to complete the
    transaction and receive any remaining change.
        - The customer's money is returned using nickels, dimes, and quarters
        (using the smallest amount of coins possible).
        - The machine's current balance must be updated to $0 remaining.
    4. After completing their purchase, the user is returned to the "Main" menu to
    continue using the vending machine.
8. All purchases are audited to prevent theft from the vending machine:
   - Each purchases generate a line in the file called `Log.txt`.
9. Unit tests demonstrate that the code works correctly.

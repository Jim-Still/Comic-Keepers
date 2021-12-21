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

1. An unauthenticated user can navigate through the site, looking through








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

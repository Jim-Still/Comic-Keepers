# Tech Elevator Final Capstone - Comic Keepers!

This is my final capstone project from Tech Elevator, Comic Keepers. We were placed in groups of four & tasked with using Agile methodologies to create a full stack app that allows users to create & manage comic book collections, & we had only 10 working days to do it. We built a relational database to manage users, collections, & stored comics/characters, & our own RESTful API to link that data with our front-end Single Page Application. We also consumed a robust 3rd party API from Marvel Comics to operate as the source of all of that data & to populate our application with beautiful cover art & information about each comic.


## Technology Used

Java

Spring Boot

SQL/Relational Database Management

HTML

CSS

Javascript

Vue.js


## Lessons Learned

This was a wild ride, that's for sure. We had a somewhat difficult group dynamic that resulted in diplomacy playing a key role, & in the end, put my experienced managerial skills to the test. About a quarter of the way through the project, a teammate made the simple error of renaming many of the server classes, which caused some Spring Boot dependancy issues & required most of the back-end to be rewritten. Later on in the process, there was a front-end bug that left two of us without the ability to use VS Code's Live Server feature, & took about two days to track down.

Ultimately, I learned just how difficult the software development process can be, & how to push through the distractions to arrive at a finished product. You have to be agile & ready to pivot - sometimes your best laid plans aren't quite going to pan out, so you need to be ready to accept alternative paths, & make forward progress for the good of the project as a whole.


## My Place In The Team

For most of this project, I was working on building our server-side RESTful API. I wrote many of the model, DAO, JDBCDAO, & Controller classes & the methods within, which also required a solid grasp of our database & SQL aggregate queries.

Additionally, I made the custom header & each of the custom navigational buttons, resulting in taking a large role in the visual design of the project.


### A Little About Comic Keepers:

The site consists of the following:

1. A home landing page, listing the currently existing collections with a preview of what's inside of them.

![HomeScreen](https://user-images.githubusercontent.com/90332162/146983358-bf1768dc-4c5e-45df-b4e5-8bd3790b6a9a.PNG)

2. A collections detail page, that shows the contents of a specific collection.

![MyCollectionsGrab](https://user-images.githubusercontent.com/90332162/146983577-2a5b5805-2033-4cb4-9864-b08c33d2d778.PNG)

3. A comic detail page, showing the specifics about an individual comic.

4. A statistics page, really just a character tracker that automatically updates whenever a new character is added to the database, by way of an appearance in a comic added from the Marvel API. This could be fleshed out to a much greater (and cooler) detail, & be a great source of information on the thousands of characters in the Marvel Universe.

![statisticsgrab](https://user-images.githubusercontent.com/90332162/146983641-caa279a2-b193-4178-964a-61090a318ae6.png)

5. A search page, that allows you search for any comics from Marvel that feature a given character. This is another feature that I would love to implement more completely, & give the user to search for more than just characters - i.e. comic title, series name, event name, etc.

![SearchGrab](https://user-images.githubusercontent.com/90332162/146983662-b6ff48a9-3496-4dc4-8331-10727d77b1d2.PNG)

6. A login page, for the user to provide authentication.

7. My Collections (for an authenticated user), a clone of the collections detal page that allows a user to manage their own collections.


### Additional Resources

Apart from the coding, I enjoyed my opportunity to provide some style to the application.

Here's the header I put together,

![CapstoneHeader](https://user-images.githubusercontent.com/90332162/146983968-47eddac7-4227-4506-843f-0e41546da9e0.png)

and an example of the distressed half-tone style of the nav buttons I made, to give the whole thing a visual design that felt uniform & true-to-brand throughout, while paying tribute to the printed page of yesteryear.

![mycollections](https://user-images.githubusercontent.com/90332162/146984670-81a5351a-6a34-4008-aa4b-e4577302b5e8.png)


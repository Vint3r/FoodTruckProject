## Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

My second weekend Project for Skill Distillery, a coding boot camp.

### Overview

The general overview of the program and usage of the program sounds fairly simple
till you look at it, at least for me. The program consists of two classes FoodTruck
and FoodTruckApp. FoodTruck is what stores most of the program's information that it
uses for it's calculations and also contains all of the methods for the program to run.
FoodTruckApp is the actual application that the user will see and interact with, printing
menus and just in general taking all the information that the user inputs and passes
it of to FoodTruck. The interface is pretty simple, it just asks what the user wants,
and provides the information that the user wants.

### Technologies/Topics applied

The FoodTruck class is the object that the whole project works around. It stores all of
the information the program will need to perform all of its calculations with a variety
of methods in its class. It has a three arg constructor for inputing all the fields it needs
and also creates a unique id for each given truck object. A few of its methods inside of it
are just simple "getters" that will go and grab the needed information from each truck instance,
most of the calls for this are within the other methods of the FoodTruck class. The rest of the
methods use for loops to break each array down into the information it cares about to compare,
and then print the desired information to the screen, allowing me to keep them all as a void
for their return type. Within the FoodTruckApp there is not a lot to go over, it first starts
of asking the user the size of the array it will need to create to hold all the trucks the user
will be putting into the system. After words it goes into a while loop that keeps track of how many
trucks still needs to be put into the system before it gets out of it. However if the user decides
they want out of the loop early they can simply type quit into the terminal and it will automatically
move on. To accomplish this I used a if statement that checks for a 'quit' after it asks the user for a
truck name. If they don't type quit it goes to the else if to proceed adding information into the system.
After the trucks have been entered or the user leaves themselves, the user will be greeted by a menu
system. The system has a few options that, when the user inputs them, will do whatever they say they do.
For instance if the user wants the average rating of all the trucks, it will provide it using the methods
within FoodTruck. To accomplish this task i decided to go with a switch statement to allow for me to
easily allow the user a bit more freedom in what they type to get what they want. Again, after the user
wishes, they may just type the number for the option to end the program or actually type exit or quit. All of
this is nested within a do while loop to make sure that the user will always be presented the menu before the
program ends.

### Lessons Learned

During this I really got to learn how picky static variables are. During the process of making the unique ID
for the trucks i accidentally made the two variables that do it static instead of just one, which would
always give every truck the same id. Also the I used just standard for loops instead of a for each loop During
all this because i couldn't quite get the for each loops to break everything down like I wanted. I realize that
this is probably because I was forgetting a import detail somewhere but couldn't figure it out. But I was able
to get what i wanted out of the basic for loops just fine either way. This project was also just really good
practice for me because I find that I do struggle a bit with arrays. But with all the array work I had to do
in this program I think I can safely say that I have improved my understanding of how to use them and get them
to work within a greater code.  

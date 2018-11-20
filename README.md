# List-User-Repos

## DESCRIPTION: 

Uses the List User Repositories Github REST API to return the list of public repositories accessible 
to my user account. 

## INSTALLATION: 

Instructions on how to clone my project:

1. Open your terminal

2. Go to the directory in which you would like the project to be cloned

3. Copy and paste the following command into the terminal and then, press **enter**: 

git clone https://github.com/BrendaMichelle/List-User-Repos.git

4. The repository will be cloned




## USAGE: 

Make sure you have java-json.jar as an external JAR added to the project as shown below:

![folder set up](https://user-images.githubusercontent.com/8907035/48665234-1770a200-ea79-11e8-945e-b4a47d279ec5.png)


If you do not have this JAR, click [here](http://chillyfacts.com/wp-content/uploads/2017/07/java-json.zip) to download it or go to this [website](http://chillyfacts.com/download-java-json-jar/). 
Be sure to extract the JAR file from the zip file after downloading. The instructions to add a JAR to your project may differ
depending on which IDE you're using. I used Eclipse, so the following instructions will be according to Eclipse.


1. Right click on the project name **List-User-Repos**

2. Click on **Properties**

3. On the left hand side, click on **Java Build Path**

4. Click on the **Libraries** tab

5. Click on **Modulepath** (no need to expand it)

6. Click on **add external JARs...**

7. Find the JAR **java-json.jar** and click **open**

8. Click **Apply and Close**


**That's it!** Afterwards, you can simply run the project (no input necessary) and it will print the repos to standard out! 
Currently, the project uses my GitHub username **brendamichelle**. If you wish to test it with your username or others, 
simply replace **brendamichelle** with another username for the **String username** within the code.




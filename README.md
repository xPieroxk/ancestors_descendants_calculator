# About the project
Using [antlr4](https://www.antlr.org/) I made a tool that can find a person's ancestors or descendants in a [gedcom](https://www.bing.com/search?q=gedcom&cvid=ec9b317358404ed09df51fe39f7da813&tqs=edge..69i57j0l5j69i60j69i61l2j69i11004.2664j0j1&pglt=43&FORM=ANNAB1&PC=HCTS) file.
This is a project for the exam of "Linguaggi e Compilatori" at the Bacheleror Degree in Computer Science at University of Camerino.<br>
Here is a [google sheet](https://docs.google.com/document/d/1EJnX4IPONEUBMGqX-KKYxOt7EbSHVydI2_ZCq5gD6FQ/edit) with details of the exam (unfortunately, it is not in English).

# Build and Run
After cloning this repository, type<br>
Windows<br>
```.\gradlew run --args="<PATH_TO_GEDCOM_FILE>"```<br>
Linux<br>
```./gradlew run --args="<PATH_TO_GEDCOM_FILE>"```<br>
from the repository (relative or absolute path)<br>
OR<br>
download the jar you prefer from releases and type<br>
```java -jar <PATH_TO_JAR> <PATH_TO_GEDCOM_FILE>```<br>

# Simpson.ged
Under the resources folder you can find the file ```Simpson.ged```. The file represents the following family tree:<br>
![ft](img/simpson_family_tree.jpg)<br>
The file specifies in the last line what it wants to calculate, in this case the descendants of Clancy Bouvier<br>
By typing:<br>
Windows<br>
```.\gradlew run --args="src\main\resources\Simpson.ged"```<br>
Linux<br>
```./gradlew run --args="src/main/resources/Simpson.ged"```<br>
from the root of this repository you should get the following output<br>
```
I10
I11
I9
I13
I2
I1
I3
I5
```
It is important to note two things:
* the tool always adds the individual among its descendants/ancestors
* the descendants/ancestors are a set and not a list i.e. they have no order

# Linked List Java Application
For this assignent, I was tasked to create a stock management application for a jewellery store using a hierarchy of
linked lists.
I based the aesthetic of my application on the German supermarket chain: Lidl - if Lidl were to have a jewellery department

![img.png](src%2Fmain%2Fresources%2Fscreenshots%2Fimg.png)
![img_1.png](src%2Fmain%2Fresources%2Fscreenshots%2Fimg_1.png)

![img_2.png](src%2Fmain%2Fresources%2Fscreenshots%2Fimg_2.png)

![img_3.png](src%2Fmain%2Fresources%2Fscreenshots%2Fimg_3.png)

![img_4.png](src%2Fmain%2Fresources%2Fscreenshots%2Fimg_4.png)
## Assignment Brief
The system should allow the user to:

* Add a new display case to the system. The following information should be stored for each
display case: unique display case number/identifier, type (wall-mounted or freestanding),
and lighting (lit or unlit).


* Add a new display tray to a display case. The following information should be stored for
each display tray: display tray identifier (one letter followed by a number e.g. A12), inlay
material colour (e.g. green), and the display tray dimensions (width x depth) in centimetres.
o Note that the display tray identifier must be unique in the system, so check that no
other display tray in any other display case has the same identifier when creating a
new display tray.


* Add an item of jewellery to a display tray. Properties that should be stored: item description
(free text to include style, etc.), type (ring, watch, necklace, etc.), target gender (male,
female, unisex, etc.), image (as a URL), and retail price.


* Add a material/component to an item of jewellery (in a display tray on a display case).
Material/component records should have properties: name/type (e.g. gold, platinum,
diamond, emerald, silver, etc.), description/information (free text e.g. type of
cut/shape/colour if a gemstone), quantity/amount/weight (in a numeric form), and quality
(in a suitable numeric form).


* View all stock in the jewellery store. This would show/list all jewellery items (with suitable
information, photos, etc.) on all display trays in all display cases.
 Interactively “drill down” through display cases, display trays, and jewellery items to see full
details (material/components etc.) of a specific item of jewellery using an appropriate GUI.
 Search for items of jewellery by text. The system will systematically search for all matches
for the given search term in every item of jewellery and its materials/components
information. It will then report the search results (in list form) on where matches are stored
in the jewellery store (i.e. which display cases and display trays). The user should then be
able to choose a search result from the list to see a full description of the given item of
jewellery (including photo, materials/components information, retail price, etc.).
2


* A “smart add” facility for jewellery items. Given the jewellery item’s description, type, value,
etc., the system will automatically identify a suitable place (i.e. display case and tray) to
store them. For instance, the system might try to store “similar items” together in the same
display tray and/or case. For instance, all platinum diamond rings might logically share a
tray (or case), as might similarly-priced gents watches, etc.
o You can have the “smart add” behave any way you think appropriate.


* Remove item of jewellery. The user should be able to identify the item of jewellery to
remove in an easy/appropriate way.

  
* Value stock facility. This facility should systematically value (1) the contents of every display
case and display tray individually, and (2) the total value of all cases/trays in the store.


* Reset facility. Clears all system data.


* Save and load the entire system data to support persistence between executions.


* This can be done using any suitable file format (e.g. CSV, XML, binary, etc.). There is
no need to use any database system beyond this.


* Other appropriate facilities to manage the jewellery store as you see fit.
o Remember that you will be strictly marked according to the marking scheme below,
so be careful not to deviate too far from the project specification.


## Marking Scheme
* Appropriate custom ADTs = 10%
* Create/add facilities (display case, display tray, item of jewellery, material/component) =
12%
* View all stock (listing) = 8%
* Interactive view stock = 7%
* Search for and select/view items of jewellery = 10%
* Smart add for items of jewellery = 10%
* Remove item of jewellery = 5%
* Value stock facility = 10%
* Reset facility = 5%
* Save/load facility = 8%
* Appropriate JavaFX user interface = 5%
* JUnit testing (minimum of 8-10 useful unit tests) = 5%
* General (commenting, style, logical approach, completeness, etc.) = 5%

## Final Grade: 50/100
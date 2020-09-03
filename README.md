[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

# Somnium
Somnium is a lightweight Java library to create beautiful & modern looking GUIs by making use of the existing Swing API.

# Icons
Icons (like the default window icon) are made by <a href="https://www.flaticon.com/authors/icongeek26" title="Icongeek26">Icongeek26</a> from <a href="https://www.flaticon.com/" title="Flaticon"> www.flaticon.com</a>.

# Creating Windows
There's two approaches to create basic windows within Somnium.

#1 - Using the SomniumWindow class directly
```java
SomniumWindow window = new SomniumWindow(); // Optionally, pass in a width, height and a title
window.show();
```

#2 - Using the SomniumWindowBuilder to build a SomniumWindow instance
```java
SomniumWindow window = new SomniumWindowBuilder().build(); // Optionally, build the window with methods like setDraggable()
window.show();
```

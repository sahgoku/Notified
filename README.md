# Notified
Notified is an Android library that informs the user of the number of his last unread notifications...

## Installation

Step 1. Add the JitPack repository to your build file
         
      allprojects {
            repositories {
              ...
              maven { url 'https://jitpack.io' }
                  }
           }
            
 Step 2. Add the dependency
 
     dependencies {
	      implementation 'com.github.sahgoku:Notified:v1.0.5'
	   }
        
## Usage


### Programmatically.

* notified_icon : setIcon(Drawable icon)
* notified_count : setNumber(int value)

### Add notified to your layout.

* notified_icon : Selected icon 
* notified_count : Number of unread notifications

      <com.jaures.notifiedlib.Notified
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:notified_count="57"
        app:notified_icon="@drawable/ic_bus"/>
	



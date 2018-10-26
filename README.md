
![alt text](https://github.com/sahgoku/Notified/blob/master/cover.png "Message")


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

        Notified notified = (Notified) findViewById(R.id.notified);

####  * Set icon :

	notified.setIcon(Drawable icon)
	notified.setIcon(Bitmap icon)
	notified.setIcon(Int resource)

#### * Set number of notifications : 
	nofified.setNumber(int value)

### Add notified to your layout.
<ol>
<li>notified_icon : Selected icon </li>
<li>notified_count : Number of unread notifications</li>
</ol>

      <com.jaures.notifiedlib.Notified
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:notified_count="57"
        app:notified_icon="@drawable/ic_bus"/>
	
### Informations.
When the number of notifications is more or equal to hundred, notified set "99+". 



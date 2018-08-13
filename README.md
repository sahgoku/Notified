# Notified
Notified is an Android library that informs the user of the number of his last unread notifications...

### Usage
Step 1. Add the JitPack repository to your build file

    allprojects {
        repositories {
		    ...
		    maven { url 'https://jitpack.io' }
    	}
    }
  
Step 2. Add the dependency

    dependencies {
	implementation 'com.github.sahgoku:Notified:v1.0.2'
    }
 
### Sample
First create view in xml
* notified_count : The number of nofifications unreaded
* notified_icon : Chosen Icon

	  <com.jaures.notified.Notified
		android:id="@+id/notified"
		android:layout_width="55dp"
		android:layout_height="50dp"
		app:notified_count="20"
		app:notified_icon="@drawable/ic_notifications_black_24dp"/>


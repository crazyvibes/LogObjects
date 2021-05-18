# LogObjects
Simple library to log object, nested objects and arraylist objects.

[![](https://jitpack.io/v/crazyvibes/LogObjects.svg)](https://jitpack.io/#crazyvibes/LogObjects)


## To get log object library into your project:

Step 1. Add the JitPack repository to your build file

### allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

### dependencies {
	        implementation 'com.github.crazyvibes:LogObjects:Tag'
	}

Step 3. Call logObject method with params context and object

### 
	{
		LogObjects.logObject(AddCropsActivity.this,itemsList);
	}

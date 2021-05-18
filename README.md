# LogObjects
Simple library to log object, nested objects and arraylist objects.

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
	        implementation 'com.github.crazyvibes:LogObjects:1.0.0'
	}

Step 3. Call logObject method with params context and object

### 
	{
		LogObjects.logObject(context, object);
	}

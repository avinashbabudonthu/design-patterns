## Steps
### Eager initialization
* Create [SingletonClass.java](SingletonClass.java)
	* This is singleton class with eager initialization
```
private static SingletonClass INSTANCE = new SingletonClass();
```
	* With this eager initialization we can directly object on calling `SingletonClass.getInstnace()` method

### Lazy initialization
* Create [SingletonClass2.java](SingletonClass2.java)
	* This is singleton class with lazy initialization
```
private static SingletonClass2 INSTANCE = null
```
	* Create object on calling `SingletonClass2.getInstance()` method
```
synchronized (lock) {
	if (null == INSTANCE)
		INSTANCE = new SingletonClass2();
}
return INSTANCE;
```

### Practice class
* [SingletonPractice.java](SingletonPractice.java)
	* `method1()` is to test eager initialization
	* `method2()` is to test lazy initialization
## Eager initialization
* Create [EagerSingletonClass.java](EagerSingletonClass.java)
* This is singleton class with eager initialization
```
private static EagerSingletonClass INSTANCE = new EagerSingletonClass();
```
* With this eager initialization we can directly get object on calling `EagerSingletonClass.getInstnace()` method

## Lazy initialization
* Create [LazySingletonClass.java](LazySingletonClass.java)
* This is singleton class with lazy initialization
```
private static SingletonClass2 INSTANCE = null
```
* Create object on calling `LazySingletonClass.getInstance()` method
```
synchronized (lock) {
	if (null == INSTANCE)
		INSTANCE = new LazySingletonClass();
}
return INSTANCE;
```

## Test class
* [SingletonPattern.java](SingletonPattern.java)
	* `eagerSingleton()` is to test eager initialization
	* `lazySingleton()` is to test lazy initialization
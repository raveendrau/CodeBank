package col.archive.examples;

public class SingletonDemo {
	static SingletonDemo singletonDemo = null;

	private SingletonDemo() {

	}

public static SingletonDemo getIntance() {
		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();
		}
		return singletonDemo;
	}
}

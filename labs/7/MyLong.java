
public class MyLong {
	long myLong = 12;
	boolean myValue = true;

	MyLong(long thierLong) {
		this.myLong = thierLong;
	}

	public long getMyLong() {
		return myLong;
	}

	public void setMyLong(long myLong) {
		this.myLong = myLong;
		 
	}

	public boolean isEven() {
		if (myLong % 2 == 0) {
			myValue = true;
		}
		return (myValue);
	}

	public boolean isOdd() {
		if (myLong % 2 == 0) {
			myValue = false;
		}
		return (myValue);
	}

	public boolean isPrime() {
		for (int i = 2; i < myLong; i++) {
			if (myLong % i == 0) {
				return (false);
			}
		}
		return (true);
	}

	static boolean isEven(MyLong thierLong) {
		return thierLong.isEven();
	}

	static boolean isOdd(MyLong thierLong) {
		return thierLong.isOdd();
	}

	static boolean isPrime(MyLong thierLong) {
		return thierLong.isPrime();
	}

	boolean equals(long myLong) {
		return this.myLong == myLong;

	}

	static boolean equals(MyLong thierLong) {
		return thierLong.equals(thierLong);

	}
}

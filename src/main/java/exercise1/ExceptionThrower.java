package exercise1;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) throws ACatchedException42 {

		if (value == 42) {
			throw new ACatchedException42();
		}

	}
}

package genericType;

public class GenericRestrictTwo {
	private class MyException extends Exception{
		
	}
	
	/**
	 * 泛型类不能继承Exception或者Throwable
	 */
//	private class MyGenericException<T> extends Exception{
//		
//	}
//	private class MyGeneric2Exception<T> extends Exception{
		
//	}
	
	/**
	 * 不能捕获范型类型限定的异常
	 */
	public <T extends Exception> void getException(T t) {
//		try {
//			
//		}catch(T e) {
//			
//		}
	}
	
	/**
	 * 可以把方法限定的范型类型抛出
	 */
	public <T extends Exception> void getException2(T t) throws T{
		try {
			
		}catch(Exception e) {
			throw t;
		}
	}
}

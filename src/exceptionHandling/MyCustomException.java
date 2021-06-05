package exceptionHandling;

class MyCustomException extends Exception {
	public MyCustomException(String s) {
		super(s);
	}
//    public String toString(){
//        String exc = " :divided by 1!! not allowed";
//        return exc;
//    }
}

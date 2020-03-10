package com.hcl.exception;

public class RecordNotFoundException extends Exception{
	 private static final long serialVersionUID = 1L;
	    private String msg;

	    public RecordNotFoundException(String msg) {
	        this.msg = msg;
	    }

	    public String getMsg() {
	        return msg;
	    }
	

}

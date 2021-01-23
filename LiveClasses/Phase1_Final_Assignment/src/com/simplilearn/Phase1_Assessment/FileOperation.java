package com.simplilearn.Phase1_Assessment;

public abstract class FileOperation {
	String operation;
	abstract void fileOperation();
	
	
	public FileOperation(String operation) {
		super();
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "File Operation Operation ----> " + operation;
	}


}

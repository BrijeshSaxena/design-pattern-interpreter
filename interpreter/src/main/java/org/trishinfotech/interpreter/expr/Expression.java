package org.trishinfotech.interpreter.expr;

import org.trishinfotech.interpreter.Employee;

public interface Expression {
	
	public boolean interpret(Employee context);
}

package org.trishinfotech.interpreter.expr;

import org.trishinfotech.interpreter.Employee;

public class DepartmentExpression extends TerminalExpression {

	protected String department;

	public DepartmentExpression(String department) {
		super();
		this.department = department;
	}

	@Override
	public boolean interpret(Employee context) {
		return context.getDepartment().name().equalsIgnoreCase(department);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartmentExpression [department=").append(department).append("]");
		return builder.toString();
	}

}

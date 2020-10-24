package org.trishinfotech.interpreter.expr;

import java.util.stream.Collectors;

import org.trishinfotech.interpreter.Employee;
import org.trishinfotech.interpreter.Manager;

public class ManagerOfExpression extends TerminalExpression {

	protected String name;

	public ManagerOfExpression(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(Employee context) {
		if (context.isManager()) {
			Manager manager = (Manager) context;
			return manager.getManagingEmployees().stream()
					.map(managingEmployee -> managingEmployee.getEmployeeName().toLowerCase())
					.collect(Collectors.toList()).contains(name.toLowerCase());
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManagerOfExpression [name=").append(name).append("]");
		return builder.toString();
	}

}

package org.trishinfotech.interpreter.expr;

import org.trishinfotech.interpreter.Employee;

public class AndExpression implements Expression {

	protected Expression left;
	protected Expression right;

	public AndExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Employee context) {
		return left.interpret(context) && right.interpret(context);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AndExpression [left=").append(left).append(", right=").append(right).append("]");
		return builder.toString();
	}

}

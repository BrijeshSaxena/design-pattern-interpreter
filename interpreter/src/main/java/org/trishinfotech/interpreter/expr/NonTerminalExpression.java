package org.trishinfotech.interpreter.expr;

public abstract class NonTerminalExpression implements Expression {

	protected Expression expression;
	
	public NonTerminalExpression() {
		super();
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	
}

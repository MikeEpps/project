/**
 * Course: Concepts of Programming Languages
 * Section: W01
 * Professor: Jose Garrido
 * Date: November 3rd, 2020
 * Author: Michael Epps
 * Assignment: CPL Project, Deliverable 
 */
package lexing.ast;

import java.util.List;

public class InfixExpression implements Expression {

    private Expression left;
    private String operator;
    private Expression right;

    public InfixExpression(Expression left, String operator) {
        this.left = left;
        this.operator = operator;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }

    public void addChildren(List<Node> children) {
        children.add(left);
        // TODO - add operator here
        children.add(right);
    }

}

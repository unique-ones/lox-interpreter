package grupa.Statements;

import grupa.Expressions.Expr;
import grupa.Expressions.ExprVisitor;
import grupa.Parser.RuntimeError;

public class Print extends Stmt {
    private final Expr expr;

    public Print(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpression() {
        return expr;
    }

    @Override
    public <R> R accept(StmtVisitor<R> stmVisitor) throws RuntimeError {
        return stmVisitor.visitPrintStatement(this);
    }

}

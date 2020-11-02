package lexing.parsing.expressions;

import grammar.TokenPattern;
import lexing.ast.Expression;
import lexing.ast.GroupedExpression;
import lexing.errors.ParsingException;
import lexing.parsing.Parser;
import lexing.parsing.TokenStream;

public class GroupedExpressionParser implements ExpressionParser<GroupedExpression> {

    @Override
    public GroupedExpression parse(Parser parser, TokenStream tokenStream) throws ParsingException {
        tokenStream.advance();

        Expression expression = parser.parseExpression(0);
        if (!tokenStream.isNext(TokenPattern.SYMBOL_PAREN_RIGHT)) {
            return null;
        }

        tokenStream.advance();
        return new GroupedExpression(expression);
    }

}

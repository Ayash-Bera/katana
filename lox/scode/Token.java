package katana.lox;

class Token{
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line;

  Token(TokenType type, String lexeme, Object literal, int line){
    this.type = type;// the type of the lex i.e is number , keyword , identifier etc.
    this.lexeme = lexeme;// the entire thing '42' but not as the int just normal as a str
    this.literal = literal;// the actual thing. eg 42 as int 
    this.line = line; //line num the lex is present in 
  }

  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}

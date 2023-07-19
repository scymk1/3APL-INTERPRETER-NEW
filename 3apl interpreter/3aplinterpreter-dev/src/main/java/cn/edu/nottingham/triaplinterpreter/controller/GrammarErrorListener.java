package cn.edu.nottingham.triaplinterpreter.controller;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class GrammarErrorListener extends BaseErrorListener {

  public static final GrammarErrorListener INSTANCE = new GrammarErrorListener();

  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
      int charPositionInLine, String msg, RecognitionException e) {
    throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
  }
}

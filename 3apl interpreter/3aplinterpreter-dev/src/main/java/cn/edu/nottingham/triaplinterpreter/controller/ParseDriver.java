package cn.edu.nottingham.triaplinterpreter.controller;

import cn.edu.nottingham.triaplinterpreter.APLGrammarLexer;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser;
import cn.edu.nottingham.triaplinterpreter.model.Agent;
import cn.edu.nottingham.triaplinterpreter.model.Atom;
import cn.edu.nottingham.triaplinterpreter.model.Goal;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParseDriver {

  public Agent parseAgent(ANTLRInputStream inputStream) {
    APLGrammarLexer lexer = new APLGrammarLexer(inputStream);
    lexer.removeErrorListeners();
    lexer.addErrorListener(GrammarErrorListener.INSTANCE);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    tokens.getTokens();
    APLGrammarParser parser = new APLGrammarParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(GrammarErrorListener.INSTANCE);
    AgentBuilder builder = new AgentBuilder();
    return builder.visitProgram(parser.program());
  }

  public Goal parseGoal(String input) {
    ANTLRInputStream inputStream = null;
    try {
      inputStream = new ANTLRInputStream(
          new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
    } catch (IOException e) {
    }
    APLGrammarLexer lexer = new APLGrammarLexer(inputStream);
    lexer.removeErrorListeners();
    lexer.addErrorListener(GrammarErrorListener.INSTANCE);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    tokens.getTokens();
    APLGrammarParser parser = new APLGrammarParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(GrammarErrorListener.INSTANCE);
    AgentBuilder builder = new AgentBuilder();
    return builder.visitGoal(parser.goal());
  }

  public Atom parseAtom(String input) {
    ANTLRInputStream inputStream = null;
    try {
      inputStream = new ANTLRInputStream(
          new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
    } catch (IOException e) {
    }
    APLGrammarLexer lexer = new APLGrammarLexer(inputStream);
    lexer.removeErrorListeners();
    lexer.addErrorListener(GrammarErrorListener.INSTANCE);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    tokens.getTokens();
    APLGrammarParser parser = new APLGrammarParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(GrammarErrorListener.INSTANCE);
    AgentBuilder builder = new AgentBuilder();
    return builder.visitAtom(parser.atom());
  }
}

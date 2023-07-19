package cn.edu.nottingham.triaplinterpreter;

import cn.edu.nottingham.triaplinterpreter.controller.MainController;

/**
 * 3APL interpreter main application.
 */
public class Application {

  MainController controller;

  public Application() {
    controller = new MainController();
  }

  public static void main(String[] args) {
    Application application = new Application();
    application.start();
  }

  public void start() {
    controller.start();
  }
}
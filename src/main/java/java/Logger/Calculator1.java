package java.Logger;

import org.apache.log4j.*;

public class Calculator1 {
    private static Logger logger = Logger.getLogger(Calculator1.class);
    static{
        try{
            /*HTMLLayout htmlLayout = new HTMLLayout();
            Appender appender = new FileAppender(htmlLayout,"log.html", true);*/
            Layout layout = new SimpleLayout();
            Appender appender = new ConsoleAppender(layout);
            logger.addAppender(appender);
            logger.setLevel(Level.DEBUG);
            logger.info("comm.java.Claculator::log4j setup ready");
        }catch (Exception e){
            e.printStackTrace();
            logger.error("com.java.Calculator::There is a known exception"+e.getMessage());
        }
    }
    public String Name(String a){
        logger.trace("Calculator.Name() started");
        logger.debug("com.java.Calculator::Setting up the name has done");
        return a;
    }
    public Integer add(Integer a, Integer b){
        logger.debug("com.java.Claculator::Calculated the variables, means performed addition");
        return a+b;
    }
    public Integer Substact(Integer a, Integer b){
        logger.debug("com.java.Claculator::performed subtraction operation");
        return a-b;
    }
    public Integer Multiply(Integer a, Integer b){
        logger.debug("com.java.Calculator::performed multiplication");
        return a*b;
    }

    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();
        System.out.println(calculator.add(89,78));
        System.out.println(calculator.Substact(89,67));
        System.out.println(calculator.Multiply(89,67));
        System.out.println(calculator.Name("Kiran"));
        logger.info("com.java.Calculator::end of compiling the entire program");
    }
}

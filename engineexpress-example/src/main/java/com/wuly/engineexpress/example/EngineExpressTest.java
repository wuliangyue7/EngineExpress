package com.wuly.engineexpress.example;
import com.wuly.engineexpress.core.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EngineExpressTest {

    private static Logger logger = LoggerFactory.getLogger(EngineExpressTest.class);

    static public void main(String[] args){
//        EngineExpress engineExpress = new EngineExpress();
//        engineExpress.funcTest();
        logger.debug("EngineExpressTest logger.debug");
    }

    public int Func1(int a, int b)
    {
        return a+b;
    }
}

package com.sample.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * This resource shows how to use JAX-RS injection and how to use
 * a spring bean as a JAX-RS resource class.
 *
 * Notice that the scope for this bean is request which means that a new
 * instance of this class will be created per request.
 * 
 * Note : Please delete SampleResourceImpl before going to live.
 */


@Scope("request")
public class SpringTestImpl implements SpringTest {

	
	private final static Logger logger = LoggerFactory.getLogger(SpringTestImpl.class);
	
    private final static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public String sayHello() { 
    	return "Hello, World!";
    }

    @Override
    public String sayHello1() {
        return null;
    }

    @Override
    public String sayHello2() {
        return null;
    }

    @Override
    public String sayHello3() {
        return null;
    }

    @Override
    public String sayHello4() {
        return null;
    }

    @Override
    public String sayHello5() {
        return null;
    }

    @Override
    public String sayHello6() {
        return null;
    }

    @Override
    public String sayHello7() {
        return null;
    }

    @Override
    public String sayHello8() {
        return null;
    }

    @Override
    public String sayHello9() {
        return null;
    }

    @Override
    public String sayHello10() {
        return null;
    }

    @Override
    public String sayHello11() {
        return null;
    }

    @Override
    public String sayHello12() {
        return null;
    }

    @Override
    public String sayHello13() {
        return null;
    }

    @Override
    public String sayHello14() {
        return null;
    }

    @Override
    public String sayHello15() {
        return null;
    }

    @Override
    public String sayHello16() {
        return null;
    }

    @Override
    public String sayHello17() {
        return null;
    }

    @Override
    public String sayHello18() {
        return null;
    }

    @Override
    public String sayHello19() {
        return null;
    }

    @Override
    public String sayHello20() {
        return null;
    }

    @Override
    public String sayHello21() {
        return null;
    }

    @Override
    public String sayHello22() {
        return null;
    }

    @Override
    public String sayHello23() {
        return null;
    }

    @Override
    public String sayHello24() {
        return null;
    }

    @Override
    public String sayHello25() {
        return null;
    }

    @Override
    public String sayHello26() {
        return null;
    }

    @Override
    public String sayHello27() {
        return null;
    }

    @Override
    public String sayHello28() {
        return null;
    }

    @Override
    public String sayHello29() {
        return null;
    }

    @Override
    public String sayHello30() {
        return null;
    }

    @Override
    public String sayHello31() {
        return null;
    }

    @Override
    public String sayHello32() {
        return null;
    }

    @Override
    public String sayHello33() {
        return null;
    }

    @Override
    public String sayHello34() {
        return null;
    }

    @Override
    public String sayHello35() {
        return null;
    }

    @Override
    public String sayHello36() {
        return null;
    }

    @Override
    public String sayHello37() {
        return null;
    }

    @Override
    public String sayHello38() {
        return null;
    }

    @Override
    public String sayHello39() {
        return null;
    }

    @Override
    public String sayHello40() {
        return null;
    }

    @Override
    public String sayHello41() {
        return null;
    }

    @Override
    public String sayHello42() {
        return null;
    }

    @Override
    public String sayHello43() {
        return null;
    }

    @Override
    public String sayHello44() {
        return null;
    }

    @Override
    public String sayHello45() {
        return null;
    }

    @Override
    public String sayHello46() {
        return null;
    }

    @Override
    public String sayHello47() {
        return null;
    }

    @Override
    public String sayHello48() {
        return null;
    }

    @Override
    public String sayHello49() {
        return null;
    }

    @Override
    public String sayHello50() {
        return null;
    }

    @Override
    public String sayHello51() {
        return null;
    }

    @Override
    public String sayHello52() {
        return null;
    }

    @Override
    public String sayHello53() {
        return null;
    }

    @Override
    public String sayHello54() {
        return null;
    }

    @Override
    public String sayHello55() {
        return null;
    }

    @Override
    public String sayHello56() {
        return null;
    }

    @Override
    public String sayHello57() {
        return null;
    }

    @Override
    public String sayHello58() {
        return null;
    }

    @Override
    public String sayHello59() {
        return null;
    }

    @Override
    public String sayHello60() {
        return null;
    }

    @Override
    public String sayHello61() {
        return null;
    }

    @Override
    public String sayHello62() {
        return null;
    }

    @Override
    public String sayHello63() {
        return null;
    }

    @Override
    public String sayHello64() {
        return null;
    }

    @Override
    public String sayHello65() {
        return null;
    }

    @Override
    public String sayHello66() {
        return null;
    }

    @Override
    public String sayHello67() {
        return null;
    }

    @Override
    public String sayHello68() {
        return null;
    }

    @Override
    public String sayHello69() {
        return null;
    }

    @Override
    public String sayHello70() {
        return null;
    }

    @Override
    public String sayHello71() {
        return null;
    }

    @Override
    public String sayHello72() {
        return null;
    }

    @Override
    public String sayHello73() {
        return null;
    }

    @Override
    public String sayHello74() {
        return null;
    }

    @Override
    public String sayHello75() {
        return null;
    }

    @Override
    public String sayHello76() {
        return null;
    }

    @Override
    public String sayHello77() {
        return null;
    }

    @Override
    public String sayHello78() {
        return null;
    }

    @Override
    public String sayHello79() {
        return null;
    }

    @Override
    public String sayHello80() {
        return null;
    }

    @Override
    public String sayHello81() {
        return null;
    }

    @Override
    public String sayHello82() {
        return null;
    }

    @Override
    public String sayHello83() {
        return null;
    }

    @Override
    public String sayHello84() {
        return null;
    }

    @Override
    public String sayHello85() {
        return null;
    }

    @Override
    public String sayHello86() {
        return null;
    }

    @Override
    public String sayHello87() {
        return null;
    }

    @Override
    public String sayHello88() {
        return null;
    }

    @Override
    public String sayHello89() {
        return null;
    }

    @Override
    public String sayHello90() {
        return null;
    }

    @Override
    public String sayHello91() {
        return null;
    }

    @Override
    public String sayHello92() {
        return null;
    }

    @Override
    public String sayHello93() {
        return null;
    }

    @Override
    public String sayHello94() {
        return null;
    }

    @Override
    public String sayHello95() {
        return null;
    }

    @Override
    public String sayHello96() {
        return null;
    }

    @Override
    public String sayHello97() {
        return null;
    }

    @Override
    public String sayHello98() {
        return null;
    }

    @Override
    public String sayHello99() {
        return null;
    }

}

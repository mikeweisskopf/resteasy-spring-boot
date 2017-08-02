package com.sample.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Sample interface that shows how a service can be implemented with a separate
 * interface. This interface can be used as programmatic contract.
 *
 * Note : Please delete SampleResource interface before going to live.
 */
@Path("/springtest")
public interface SpringTest {

    @GET
    @Produces({ MediaType.TEXT_PLAIN })
    @Path("/hello")
    String sayHello();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello1")
//    String sayHello1();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello2")
//    String sayHello2();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello3")
//    String sayHello3();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello4")
//    String sayHello4();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello5")
//    String sayHello5();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello6")
//    String sayHello6();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello7")
//    String sayHello7();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello8")
//    String sayHello8();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello9")
//    String sayHello9();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello10")
//    String sayHello10();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello11")
//    String sayHello11();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello12")
//    String sayHello12();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello13")
//    String sayHello13();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello14")
//    String sayHello14();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello15")
//    String sayHello15();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello16")
//    String sayHello16();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello17")
//    String sayHello17();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello18")
//    String sayHello18();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello19")
//    String sayHello19();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello20")
//    String sayHello20();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello21")
//    String sayHello21();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello22")
//    String sayHello22();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello23")
//    String sayHello23();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello24")
//    String sayHello24();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello25")
//    String sayHello25();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello26")
//    String sayHello26();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello27")
//    String sayHello27();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello28")
//    String sayHello28();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello29")
//    String sayHello29();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello30")
//    String sayHello30();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello31")
//    String sayHello31();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello32")
//    String sayHello32();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello33")
//    String sayHello33();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello34")
//    String sayHello34();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello35")
//    String sayHello35();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello36")
//    String sayHello36();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello37")
//    String sayHello37();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello38")
//    String sayHello38();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello39")
//    String sayHello39();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello40")
//    String sayHello40();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello41")
//    String sayHello41();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello42")
//    String sayHello42();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello43")
//    String sayHello43();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello44")
//    String sayHello44();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello45")
//    String sayHello45();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello46")
//    String sayHello46();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello47")
//    String sayHello47();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello48")
//    String sayHello48();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello49")
//    String sayHello49();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello50")
//    String sayHello50();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello51")
//    String sayHello51();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello52")
//    String sayHello52();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello53")
//    String sayHello53();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello54")
//    String sayHello54();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello55")
//    String sayHello55();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello56")
//    String sayHello56();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello57")
//    String sayHello57();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello58")
//    String sayHello58();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello59")
//    String sayHello59();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello60")
//    String sayHello60();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello61")
//    String sayHello61();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello62")
//    String sayHello62();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello63")
//    String sayHello63();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello64")
//    String sayHello64();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello65")
//    String sayHello65();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello66")
//    String sayHello66();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello67")
//    String sayHello67();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello68")
//    String sayHello68();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello69")
//    String sayHello69();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello70")
//    String sayHello70();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello71")
//    String sayHello71();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello72")
//    String sayHello72();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello73")
//    String sayHello73();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello74")
//    String sayHello74();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello75")
//    String sayHello75();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello76")
//    String sayHello76();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello77")
//    String sayHello77();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello78")
//    String sayHello78();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello79")
//    String sayHello79();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello80")
//    String sayHello80();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello81")
//    String sayHello81();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello82")
//    String sayHello82();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello83")
//    String sayHello83();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello84")
//    String sayHello84();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello85")
//    String sayHello85();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello86")
//    String sayHello86();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello87")
//    String sayHello87();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello88")
//    String sayHello88();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello89")
//    String sayHello89();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello90")
//    String sayHello90();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello91")
//    String sayHello91();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello92")
//    String sayHello92();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello93")
//    String sayHello93();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello94")
//    String sayHello94();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello95")
//    String sayHello95();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello96")
//    String sayHello96();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello97")
//    String sayHello97();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello98")
//    String sayHello98();
//
//    @GET
//    @Produces({ MediaType.TEXT_PLAIN })
//    @Path("/hello99")
//    String sayHello99();

}
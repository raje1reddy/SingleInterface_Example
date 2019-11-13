package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class EmployeeTest {

        private Employee employee;
        private Manager manager;
        private Programmer programmer;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){

            employee = new Employee();
            manager = new Manager();
            programmer = new Programmer();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            employee = null;
        }
        @Test
        public void inheritanceExample() {
             employee.startProjectWork();
             employee.reachOffice();

            //System.out.println(result);
            //int expectedresult = 6;
            //assertEquals(expectedresult,result);
        }
    @Test
    public void inheritanceExample1() {
        employee.startProjectWork();
        employee.reachOffice();
        manager.reportProjectStatus();
        //manager.teamSize();
    }

    @Test
    public void inheritanceExample2() {
        employee.startProjectWork();
        employee.reachOffice();
        programmer.accessBaseClassMembers();
        programmer.writeCode();
    }


}




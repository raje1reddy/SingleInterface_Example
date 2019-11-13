package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerTest {

    Programmer programmer = new Programmer();
   // Employee employee = new Employee();

    @Test
    public void writeCode() {
     //  employee.accessBaseClassMembers();
    }

    @Test
    public void accessBaseClassMembers() {
        programmer.reachOffice();
        programmer.startProjectWork();
        programmer.writeCode();
        programmer.accessBaseClassMembers();
    }
}
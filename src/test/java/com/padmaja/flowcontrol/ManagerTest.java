package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    Manager manager = new Manager();
    @Test
    public void reportProjectStatus() {
        manager.startProjectWork();
        manager.reachOffice();
        manager.reportProjectStatus();


    }
}
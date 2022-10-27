package com.programmers.java.structural_patterns.proxy;

import com.programmers.java.structural_patterns.proxy.logging_proxy.SimulationLogging;
import com.programmers.java.structural_patterns.proxy.protection_proxy.SimulationProtection;
import com.programmers.java.structural_patterns.proxy.virtual_proxy.SimulationVirtual;

import java.util.HashMap;
import java.util.Map;

public class Application {

    static Map<Integer, Simulation> map = new HashMap<>() {{
        put(1, new SimulationLogging());
        put(2, new SimulationVirtual());
        put(3, new SimulationProtection());
    }};

    public static void main(String[] args) {
        Simulation simulation;

        /******** 로깅 프록시 *******/
        simulation = map.get(1);
        simulation.run();
        simulation.jump();

        /******** 가상 프록시 *******/
        simulation = map.get(2);
        simulation.run();
        simulation.jump();

        /******** 보호 프록시 *******/
        simulation = map.get(3);
        simulation.run();
        simulation.jump();
    }
}

package daumer.alban.experimental.jacoco.multimodule.main;

import daumer.alban.experimental.jacoco.multimodule.services.DumbMainService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(DumbMainService.getMessage());
    }
}
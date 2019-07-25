package ru.ivanov.singtel;

import ru.ivanov.singtel.birds.Bird;
import ru.ivanov.singtel.birds.Duck;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest{ @Test void testAdd(){ assertEquals(5,new Calculator().add(2,3)); }}
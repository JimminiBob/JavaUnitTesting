package com.sparta.jn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    // all tests are public
//    @Test
//    @DisplayName("This is my first test")
////    void firstTest() {
////        Assertions.assertEquals(1,2);
////    }

    @Test
    @DisplayName("Given the time is 21, return Good Evening")
    void givenTheTimeis21ReturnGoodEvening() {
        int time = 21;
        String expected = "Good evening";
        String answer = Greeter.getGreeting(time);

        //Assertions.assertEquals("Good evening", Greeter.getGreeting(21));
        Assertions.assertEquals(expected, answer);
        //Assertions.assertEquals("Good morning", Greeter.getGreeting(5));

    }

    @Test
    @DisplayName("Given the time is 5 return Good morning")
    void givenThetimeis5ReturnGoodMorning() {
        Assertions.assertEquals("Good Morning", Greeter.getGreeting(5));

    }

    @Test
    @DisplayName("Given the time is 12 return Good morning")
    void givenThetimeis12ReturnGoodMorning() {
        Assertions.assertEquals("Good Afternoon", Greeter.getGreeting(12));

    }
}

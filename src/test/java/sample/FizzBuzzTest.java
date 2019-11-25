package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest extends FizzBuzz {

    @BeforeEach
    void beforeEach() {
        System.out.println("@BeforeEach()のテスト");
    }

    @AfterEach
    void afterEach() {
        System.out.println("@AfterEach()のテスト");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll()のテスト");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@@AfterAll()のテスト");
    }

    @Test
    void 数値が3でも5でも割り切れる() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
    }

    @Test
    void 数値が3で割り切れる() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
    }

    @Test
    void 数値が5で割り切れる() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }

}

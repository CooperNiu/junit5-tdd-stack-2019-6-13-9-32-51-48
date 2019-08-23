package com.thoughtworks.tdd;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	 @Test
	    public void should_be_1() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(1);

	        //then
	        assertThat(actual, is("1"));
	    }
	 @Test
	    public void should_be_3() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(3);

	        //then
	        assertThat(actual, is("Fizz"));
	    }
	 @Test
	    public void should_be_5() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(5);

	        //then
	        assertThat(actual, is("Buzz"));
	    }
	 @Test
	    public void should_be_7() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(7);

	        //then
	        assertThat(actual, is("Whizz"));
	    }
	 @Test
	    public void should_be_3_5() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(15);
	        System.out.println(actual);

	        //then
	        assertThat(actual, is("FizzBuzz"));
	    }
	 @Test
	    public void should_be_5_7() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(35);

	        //then
	        assertThat(actual, is("BuzzWhizz"));
	    }
	 @Test
	    public void should_be_3_7() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(21);

	        //then
	        assertThat(actual, is("FizzWhizz"));
	    }
	 @Test
	    public void should_be_3_5_7() {
	        //given
	        Game game = new Game();

	        //when
	        String actual = game.result(105);

	        //then
//	        Assertions.assertEquals(actual, "FizzBuzzWhizz");
	        assertThat(actual, is("FizzBuzzWhizz"));
	    }
}

package tobiaszAGuideForBeginner.chapter1.page41.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockTest
{

    private Block unitTest;

    @Before
    public void setUp()
    {
        this.unitTest = new Block();
    }

    @Test
    public void test()
    {
        //given

        int x = 8;
        int y = 23;

        //when

        int result = this.unitTest.block(x, y);

        //then

        Assertions.assertThat(result).isZero();
    }

}
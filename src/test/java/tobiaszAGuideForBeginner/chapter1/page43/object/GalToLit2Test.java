package tobiaszAGuideForBeginner.chapter1.page43.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GalToLit2Test {

    private GalToLit2 unitTest;

    @Before
    public  void setUp()
    {

        this.unitTest = new GalToLit2();

    }

    @Test
    public void test()
    {
        //given

        //when

        int i = this.unitTest.displayingSubtitles();

        //then

        Assertions.assertThat(i).isZero();

    }

}
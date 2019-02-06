package tobiaszAGuideForBeginner.chapter1.page40.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemonstrationForLoopTest {

    private DemonstrationForLoop unitTest;

    @Before
    public void setUp()
    {

       this.unitTest = new DemonstrationForLoop();

    }

    @Test
    public void shouldReturnedEnd()
    {
        //given

        int x = 2;

        //when

        String result = this.unitTest.Petla(x);

        //then

        Assertions.assertThat(result).endsWith("koniec");
    }

    @Test
    public void shouldPastBecauseContainsIsString()
    {

        //given

        int x = 0;

        //when

        String result = this.unitTest.Petla(x);

        //then

        Assertions.assertThat(result).contains("");
    }

}
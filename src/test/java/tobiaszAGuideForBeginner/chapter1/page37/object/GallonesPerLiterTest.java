package tobiaszAGuideForBeginner.chapter1.page37.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;


public class GallonesPerLiterTest
{

    private GallonesPerLiter unitTest;

    @Before
    public void setUp()
    {
        this.unitTest = new GallonesPerLiter();
    }

    @Test
    public void testPastBecauseResultIsLessThen40()
    {

        //given
        int number = 10;

        //when
        double result = this.unitTest.gallonsPerLitersMultiplication(number);

        //then
        Assertions.assertThat(result).isLessThanOrEqualTo(40);

    }

    @Test
    public void testPastBecauseResultIsEqual0()
    {
        //given
        int number = 0;

        //when
        double result = this.unitTest.gallonsPerLitersMultiplication(number);

        //then
        Assertions.assertThat(result).isZero();



    }

}


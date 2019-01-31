package tobiaszAGuideForBeginner.chapter1.page34.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DivisionXByTwoTest
{
    private DivisionXByTwo underTest;


    @Before
    public void setUp()
    {

        this.underTest = new DivisionXByTwo();
    }


    @Test
    public void divisionForTwoWeExpectTrue()
    {

        //given

        underTest.setX(1024);

        //when

        double result = this.underTest.divisionForTwo();

        //then

        Assertions.assertThat(result).isEqualTo(512);

    }

    @Test
    public void divisionForTwoResultMastBeGreaterThen100()
    {
        //given

        underTest.setX(512);

        //when

        double result = this.underTest.divisionForTwo();

        //then

        Assertions.assertThat(result).isGreaterThan(100.0);

    }
    @Test
    public void divisionForTwoResultMastBeLessOrEqualToResult()
    {

        //given

        underTest.setX(1024);

        //when

        double result = this.underTest.getY();

        //then

        Assertions.assertThat(result).isLessThanOrEqualTo(123);
    }


}
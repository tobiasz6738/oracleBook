package tobiaszAGuideForBeginner.chapter1.page36.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DivisionXYByFourTest
{

    private DivisionXYByFour underTest;

    @Before
    public void setUp()
    {
        this.underTest = new DivisionXYByFour();
    }

    @Test
    public void testShouldPastBecauseResultIsEqualToTwoAndHalf()
    {
        //given
        int number = 10;

        //when
        double result = this.underTest.divisionYBYFour(number);

        //then
        Assertions.assertThat(result).isEqualTo(2.5);

    }

    @Test
    public void testShouldPastBecauseResultIsNegative()
    {
        //given
        int number = -10;

        //when
        int result = this.underTest.divisionXBYFour(number);

        //then
        Assertions.assertThat(result).isNegative();
    }

    @Test
    public void test()
    {

        //given
        int number = 102;

        //when
        int result = this.underTest.divisionXBYFour(number);
        //then

        Assertions.assertThat(result).isGreaterThanOrEqualTo(10);
    }
}

package tobiaszAGuideForBeginner.chapter1.page39.object;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DemonstrationOfTheIfFunctionMainTest {

    private DemonstrationOfTheIfFunction uniTest;

    @Before
    public void setUp()
    {
        this.uniTest = new DemonstrationOfTheIfFunction();
    }

    @Test
    public void shouldGiveFalseBecauseAIsSmallerThenB()
    {
        //given

        int a = 3;
        int b = 4;

        //then

        boolean result = this.uniTest.instructionIf(a, b);

        //when

        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void shouldPassBecauseCIsEqual0()
    {
        //given

     //   int c = this.uniTest.getC();

        //then

        int result = this.uniTest.getC();

        //when

        Assertions.assertThat(result).isEqualTo(0);
    }

}
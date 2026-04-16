import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testCharacterShowsUpMultipleTimesGivesCorrectFrequency(){
        //Arange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        
        //Act
        int actual = counter.getFrequency('l');

        //Assert
        assertEquals(2, actual);
    }

    @Test
    void testGetRelativeFrequencyReturns0ForMissingCharacter(){
        //arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //act
        double actual = counter.getRelativePercentage('x');
        //assert
        assertEquals(0.0, actual, 0.0001);
    }
}
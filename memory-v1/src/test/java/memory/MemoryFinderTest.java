package memory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryFinderTest {

    @DisplayName("memory test")
    @Test
    public void memoryTest() throws Exception{
        MemoryFinder memoryFinder = new MemoryFinder();
        Memory memory = memoryFinder.get();
        System.out.println("memory = " + memory);
        Assertions.assertThat(memory).isNotNull();
    }

}
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer ไม่ว่างนะ", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer ไม่เต็มนะ", result);
    }

    @Test
    public void write_A_to_buffer_should_read_A() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());

    }

    @Test
    public void write_A_to_new_buffer_should_not_be_empty() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        boolean result = cb.isEmpty();
        assertFalse("Buffer is empty", result);
    }

    @Test
    public void write_A_for_nine_times_and_buffer_is_not_full() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<9; i++) {
            cb.writeData("A");
        }
        boolean result = cb.isFull();
        assertFalse("Buffer is not full", result);

    }

    @Test
    public void write_A_for_ten_times_then_11th_time_B_should_overwrite_A () {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++) {
            cb.writeData("A");
        }
        cb.writeData("B");
        assertEquals("B", cb.readData());
    }

}
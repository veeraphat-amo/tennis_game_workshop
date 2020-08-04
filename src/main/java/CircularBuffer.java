public class CircularBuffer {

    private final int bufferSize;
    private final String[] buffer;
    private int readPointer;
    private int writePointer;

    //Default constructor
    public CircularBuffer(){
        this(10);
    }

    //Overload constructure
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        // bufferSize--;
        this.buffer[writePointer++] = input;
        if(writePointer ==10){
            writePointer = 0;
        }
    }

    public boolean isFull() {
        return writePointer >= bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}

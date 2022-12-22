public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Mark mark;
    enum Mark {
        Acer,
        Asus,
        Lenovo,
        Samsung
    }
    Computer(int clockSpeed, int bitDepth, int memorySize, int screenDiagonal, int markChoice){
        this.processor = new Processor(clockSpeed, bitDepth);
        this.memory=new Memory(memorySize);
        this.monitor = new Monitor(screenDiagonal);
        switch (markChoice) {
            case 1:
                mark = Mark.Acer;
                break;
            case 2:
                mark = Mark.Asus;
                break;
            case 3:
                mark = Mark.Lenovo;
                break;
            case 4:
                mark = Mark.Samsung;
                break;
            default:
                break;
        }
    }
    public String toString(){
        return mark+": "+processor+", "+memory+", "+monitor;
    }
}

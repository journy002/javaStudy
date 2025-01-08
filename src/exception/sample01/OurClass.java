package exception.sample01;

public class OurClass {
    private final boolean JUST = true;

    // throws : 던지다(=예외를 던지다 / 발생시키다)
    public void thisMethodIsDangerous() throws OurBadException {
        // custom logic
        if (JUST) {
            throw new OurBadException();
        }
    }
}

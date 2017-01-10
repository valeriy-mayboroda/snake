public class SnakeSection
{
    private int x;
    private int y;


    public SnakeSection(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || o.getClass() != getClass())
            return false;
        SnakeSection ss = (SnakeSection)o;
        return ss.getX() == getX() && ss.getY() == getY();
    }

    @Override
    public int hashCode() {
        int code = 27;
        int result = code + code*getX();
        result = code*result + code*getY();
        return result;
    }
}
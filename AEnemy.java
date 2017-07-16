public abstract class AEnemy implements IEnemy {

    protected String name;
    protected float y;

    public float getYpos() {
        return this.y;
    }

    public String toString() {
        return this.y + "   " + this.name;
    }

    public AEnemy(String n,  float startY)
    {
        this.name = n;
        this.y = startY;
    }
}

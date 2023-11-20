package observator;

import java.util.Observable;

/**
 *
 * @author junio
 */
public class ObjetoObservavel extends Observable{
    private int x;
    private int y;

    public ObjetoObservavel() {
        this.x = 1;
        this.y = 1;
    }

    public void setX(int x) {
        if(this.x !=x)
            this.setChanged();
        this.x = x;
        this.notifyObservers();        
    }

    public void setY(int y) {
        if(this.y !=y)
            this.setChanged();
        this.y = y;
        this.notifyObservers();                
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
